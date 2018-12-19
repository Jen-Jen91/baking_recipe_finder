package com.example.Recipes.projections;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.models.SavedRecipe;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedAllSavedRecipe", types = SavedRecipe.class)
public interface SavedRecipeProjection {
    Long getId();
    String getName();
    String getInstructions();
    String getImage_url();
    int getTime();
    List<Ingredient> getIngredients();
}
