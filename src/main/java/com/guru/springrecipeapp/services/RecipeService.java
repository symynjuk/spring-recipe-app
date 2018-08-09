package com.guru.springrecipeapp.services;

import com.guru.springrecipeapp.commands.RecipeCommand;
import com.guru.springrecipeapp.domain.Recipe;


import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand findCommandById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
    void deleteById(Long idToDelete);

}
