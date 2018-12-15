package com.example.Recipes.controllers;

import com.example.Recipes.models.Recipe;
import com.example.Recipes.repositories.RecipeRepository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/recipes")
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;


}
