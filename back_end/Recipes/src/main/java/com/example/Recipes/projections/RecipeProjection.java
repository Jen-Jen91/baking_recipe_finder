package com.example.Recipes.projections;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.models.InstructionType;
import com.example.Recipes.models.Recipe;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedAllRecipe", types = Recipe.class)
public interface RecipeProjection {
    Long getId();
    String getName();
    String getInstructions();
    String getImage_url();
    int getTime();
    List<Ingredient> getIngredients();
}
