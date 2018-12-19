package com.example.Recipes.controllers;

import com.example.Recipes.repositories.IngredientRepository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ingredients")
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

}
