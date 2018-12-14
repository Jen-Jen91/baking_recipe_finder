package com.example.Recipes.components;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.models.Recipe;
import com.example.Recipes.repositories.IngredientRepository;
import com.example.Recipes.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeRepository recipeRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Ingredient nutella = new Ingredient("Nutella");
        ingredientRepository.save(nutella);

        Ingredient flour = new Ingredient("Flour");
        ingredientRepository.save(flour);

        Ingredient egg = new Ingredient("Egg");
        ingredientRepository.save(egg);

        Ingredient sugar = new Ingredient("Sugar");
        ingredientRepository.save(sugar);

        Ingredient peanutButter = new Ingredient("Peanut Butter");
        ingredientRepository.save(peanutButter);

        Ingredient butter = new Ingredient("Butter");
        ingredientRepository.save(butter);

        Ingredient chocolate = new Ingredient("Chocolate");
        ingredientRepository.save(chocolate);

        Recipe recipe1 = new Recipe("Flourless Chocolate Cake", "Make cake", "cake.jpg", 40);
        recipeRepository.save(recipe1);

        Recipe recipe2 = new Recipe("Nutella Brownie", "Make brownies", "brownies.jpg", 30);
        recipeRepository.save(recipe2);

        Recipe recipe3 = new Recipe("Peanut Butter Cookies", "Make cookies", "cookies.jpg", 20);
        recipeRepository.save(recipe3);

        recipe1.addIngredient(egg);
        recipe1.addIngredient(chocolate);
        recipe1.addIngredient(butter);
        recipeRepository.save(recipe1);

        recipe2.addIngredient(egg);
        recipe2.addIngredient(nutella);
        recipe2.addIngredient(flour);
        recipeRepository.save(recipe2);

        recipe3.addIngredient(egg);
        recipe3.addIngredient(sugar);
        recipe3.addIngredient(peanutButter);
        recipeRepository.save(recipe3);

        egg.addRecipe(recipe1);
        egg.addRecipe(recipe2);
        egg.addRecipe(recipe3);
        ingredientRepository.save(egg);

        chocolate.addRecipe(recipe1);
        ingredientRepository.save(chocolate);

        butter.addRecipe(recipe1);
        ingredientRepository.save(butter);

        nutella.addRecipe(recipe2);
        ingredientRepository.save(nutella);

        flour.addRecipe(recipe2);
        ingredientRepository.save(flour);

        sugar.addRecipe(recipe3);
        ingredientRepository.save(sugar);

        peanutButter.addRecipe(recipe3);
        ingredientRepository.save(peanutButter);

    }

}
