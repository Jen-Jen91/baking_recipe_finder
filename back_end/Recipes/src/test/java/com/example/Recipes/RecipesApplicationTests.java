package com.example.Recipes;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.models.InstructionType;
import com.example.Recipes.models.Recipe;
import com.example.Recipes.repositories.IngredientRepository.IngredientRepository;
import com.example.Recipes.repositories.RecipeRepository.RecipeRepository;
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
		Recipe recipe = new Recipe("Nutella Brownies", InstructionType.NUTELLA_BROWNIE , "brownie.jpg", 25);
		assertEquals("Nutella Brownies", recipe.getName());
	}

	@Test
	public void canAddIngredientToRecipe() {
		Ingredient ingredient = new Ingredient("nutella");
		ingredientRepository.save(ingredient);

		Recipe recipe = new Recipe("Nutella Brownies", InstructionType.NUTELLA_BROWNIE , "brownie.jpg", 25);
		recipeRepository.save(recipe);

		recipe.addIngredient(ingredient);
		recipeRepository.save(recipe);

		assertEquals(1, recipe.getIngredients().size());
	}

	@Test
	public void canAddRecipeToIngredient() {
		Ingredient ingredient = new Ingredient("nutella");
		ingredientRepository.save(ingredient);

		Recipe recipe = new Recipe("Nutella Brownies", InstructionType.NUTELLA_BROWNIE , "brownie.jpg", 25);
		recipeRepository.save(recipe);

		ingredient.addRecipe(recipe);
		ingredientRepository.save(ingredient);

		assertEquals(1, ingredient.getRecipes().size());
	}

	@Test
	public void canGetRecipeInstructions() {
		Recipe recipe = new Recipe("Nutella Brownies", InstructionType.NUTELLA_BROWNIE , "brownie.jpg", 25);
		recipeRepository.save(recipe);

		assertEquals("1 1/4 cup Nutella: 2 large eggs: 1/2 cup all purpose flour + Preheat oven to 350°F.: Grease a 9 inch x 9 inch metal baking pan.: Add all ingredients into a large bowl and mix until batter is smooth.: Pour into baking pan and smooth top with spatula.: Bake for about 15 minutes until toothpick inserted comes out clean. Be careful not to bake too long otherwise brownies will dry out.: Let brownies cool and set before cutting and serving.", recipe.getInstructions());
	}

}

