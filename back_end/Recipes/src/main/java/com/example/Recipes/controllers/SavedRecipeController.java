package com.example.Recipes.controllers;

import com.example.Recipes.repositories.SavedRecipeRepository.SavedRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/savedRecipes")
public class SavedRecipeController {

    @Autowired
    SavedRecipeRepository savedRecipeRepository;

}
