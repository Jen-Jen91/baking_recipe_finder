package com.example.Recipes;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.models.Recipe;
import com.example.Recipes.repositories.IngredientRepository;
import com.example.Recipes.repositories.RecipeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecipesApplicationTests {

	@Autowired
	IngredientRepository ingredientRepository;

	@Autowired
	RecipeRepository recipeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetIngredientName() {
		Ingredient ingredient = new Ingredient("egg");
		assertEquals("egg", ingredient.getName());
	}

	@Test
	public void canGetRecipeName() {
		Recipe recipe = new Recipe("Soup", "Heat soup", "soup.jpg", 2);
		assertEquals("Soup", recipe.getName());
	}

	@Test
	public void canAddIngredientToRecipe() {
		Ingredient ingredient = new Ingredient("chicken");
		ingredientRepository.save(ingredient);

		Recipe recipe = new Recipe("Chicken Soup", "Heat soup", "soup.jpg", 2);
		recipeRepository.save(recipe);

		recipe.addIngredient(ingredient);
		recipeRepository.save(recipe);

		assertEquals(1, recipe.getIngredients().size());
	}

	@Test
	public void canAddRecipeToIngredient() {
		Ingredient ingredient = new Ingredient("chicken");
		ingredientRepository.save(ingredient);

		Recipe recipe = new Recipe("Chicken Soup", "Heat soup", "soup.jpg", 2);
		recipeRepository.save(recipe);

		ingredient.addRecipe(recipe);
		ingredientRepository.save(ingredient);

		assertEquals(1, ingredient.getRecipes().size());
	}

}

