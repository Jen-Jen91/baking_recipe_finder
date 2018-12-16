package com.example.Recipes.components;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.models.Recipe;
import com.example.Recipes.repositories.IngredientRepository.IngredientRepository;
import com.example.Recipes.repositories.RecipeRepository.RecipeRepository;
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
        Ingredient nutella = new Ingredient("nutella");
        ingredientRepository.save(nutella);

        Ingredient sRFlour = new Ingredient("self-raising flour");
        ingredientRepository.save(sRFlour);

        Ingredient egg = new Ingredient("egg");
        ingredientRepository.save(egg);

        Ingredient casterSugar = new Ingredient("caster sugar");
        ingredientRepository.save(casterSugar);

        Ingredient goldenCasterSugar = new Ingredient("golden caster sugar");
        ingredientRepository.save(goldenCasterSugar);

        Ingredient icingSugar = new Ingredient("icing sugar");
        ingredientRepository.save(icingSugar);

        Ingredient peanutButter = new Ingredient("peanut butter");
        ingredientRepository.save(peanutButter);

        Ingredient unsaltedButter = new Ingredient("unsalted butter");
        ingredientRepository.save(unsaltedButter);

        Ingredient darkChocolate = new Ingredient("dark chocolate");
        ingredientRepository.save(darkChocolate);

        Ingredient vegOil = new Ingredient("vegetable oil");
        ingredientRepository.save(vegOil);

        Ingredient milk = new Ingredient("milk");
        ingredientRepository.save(milk);

        Ingredient salt = new Ingredient("salt");
        ingredientRepository.save(salt);

        Ingredient bakingPowder = new Ingredient("baking powder");
        ingredientRepository.save(bakingPowder);

        Ingredient vanilla = new Ingredient("vanilla essence");
        ingredientRepository.save(vanilla);

        Ingredient strawJam = new Ingredient("strawberry jam");
        ingredientRepository.save(strawJam);

        Ingredient banana = new Ingredient("banana");
        ingredientRepository.save(banana);

        Recipe recipe1 = new Recipe("Flourless Chocolate Cake", "Make cake", "cake.jpg", 40);
        recipeRepository.save(recipe1);

        Recipe recipe2 = new Recipe("Nutella Brownie", "Make brownies", "brownies.jpg", 30);
        recipeRepository.save(recipe2);

        Recipe recipe3 = new Recipe("Peanut Butter Cookies", "Make cookies", "cookies.jpg", 25);
        recipeRepository.save(recipe3);

        Recipe recipe4 = new Recipe("Basic Muffins", "Make muffins", "muffins.jpg", 55);
        recipeRepository.save(recipe4);

        Recipe recipe5 = new Recipe("Classic Victoria Sandwich", "Make cake", "victoria.jpg", 40);
        recipeRepository.save(recipe5);

        Recipe recipe6 = new Recipe("Banana Loaf", "Make loaf", "banana.jpg", 55);
        recipeRepository.save(recipe6);

        recipe1.addIngredient(egg);
        recipe1.addIngredient(darkChocolate);
        recipe1.addIngredient(unsaltedButter);
        recipeRepository.save(recipe1);

        recipe2.addIngredient(egg);
        recipe2.addIngredient(nutella);
        recipe2.addIngredient(sRFlour);
        recipeRepository.save(recipe2);

        recipe3.addIngredient(egg);
        recipe3.addIngredient(goldenCasterSugar);
        recipe3.addIngredient(peanutButter);
        recipe3.addIngredient(salt);
        recipeRepository.save(recipe3);

        recipe4.addIngredient(egg);
        recipe4.addIngredient(vegOil);
        recipe4.addIngredient(milk);
        recipe4.addIngredient(goldenCasterSugar);
        recipe4.addIngredient(sRFlour);
        recipe4.addIngredient(salt);
        recipeRepository.save(recipe4);

        recipe5.addIngredient(casterSugar);
        recipe5.addIngredient(unsaltedButter);
        recipe5.addIngredient(egg);
        recipe5.addIngredient(sRFlour);
        recipe5.addIngredient(bakingPowder);
        recipe5.addIngredient(milk);
        recipe5.addIngredient(icingSugar);
        recipe5.addIngredient(vanilla);
        recipe5.addIngredient(strawJam);
        recipeRepository.save(recipe5);

        recipe6.addIngredient(unsaltedButter);
        recipe6.addIngredient(casterSugar);
        recipe6.addIngredient(egg);
        recipe6.addIngredient(sRFlour);
        recipe6.addIngredient(bakingPowder);
        recipe6.addIngredient(banana);
        recipe6.addIngredient(icingSugar);
        recipeRepository.save(recipe6);

        egg.addRecipe(recipe1);
        egg.addRecipe(recipe2);
        egg.addRecipe(recipe3);
        egg.addRecipe(recipe4);
        egg.addRecipe(recipe5);
        egg.addRecipe(recipe6);
        ingredientRepository.save(egg);

        darkChocolate.addRecipe(recipe1);
        ingredientRepository.save(darkChocolate);

        unsaltedButter.addRecipe(recipe1);
        unsaltedButter.addRecipe(recipe5);
        unsaltedButter.addRecipe(recipe6);
        ingredientRepository.save(unsaltedButter);

        nutella.addRecipe(recipe2);
        ingredientRepository.save(nutella);

        sRFlour.addRecipe(recipe2);
        sRFlour.addRecipe(recipe4);
        sRFlour.addRecipe(recipe5);
        sRFlour.addRecipe(recipe6);
        ingredientRepository.save(sRFlour);

        casterSugar.addRecipe(recipe5);
        casterSugar.addRecipe(recipe6);
        ingredientRepository.save(casterSugar);

        icingSugar.addRecipe(recipe5);
        icingSugar.addRecipe(recipe6);
        ingredientRepository.save(icingSugar);

        goldenCasterSugar.addRecipe(recipe3);
        goldenCasterSugar.addRecipe(recipe4);
        ingredientRepository.save(goldenCasterSugar);

        peanutButter.addRecipe(recipe3);
        ingredientRepository.save(peanutButter);

        vegOil.addRecipe(recipe4);
        ingredientRepository.save(vegOil);

        milk.addRecipe(recipe4);
        milk.addRecipe(recipe5);
        ingredientRepository.save(milk);

        sRFlour.addRecipe(recipe4);
        ingredientRepository.save(sRFlour);

        salt.addRecipe(recipe3);
        salt.addRecipe(recipe4);
        ingredientRepository.save(salt);

        bakingPowder.addRecipe(recipe5);
        bakingPowder.addRecipe(recipe6);
        ingredientRepository.save(bakingPowder);

        vanilla.addRecipe(recipe5);
        ingredientRepository.save(vanilla);

        strawJam.addRecipe(recipe5);
        ingredientRepository.save(strawJam);

        banana.addRecipe(recipe6);
        ingredientRepository.save(banana);

    }

}
