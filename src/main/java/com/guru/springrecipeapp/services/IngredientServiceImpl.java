package com.guru.springrecipeapp.services;

import com.guru.springrecipeapp.commands.IngredientCommand;
import com.guru.springrecipeapp.converters.IngredientToIngredientCommand;
import com.guru.springrecipeapp.converters.RecipeToRecipeCommand;
import com.guru.springrecipeapp.domain.Ingredient;
import com.guru.springrecipeapp.domain.Recipe;
import com.guru.springrecipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@Slf4j
public class IngredientServiceImpl implements IngredientService {
   private final RecipeRepository recipeRepository;
   private final IngredientToIngredientCommand ingredientToIngredientCommand;

    public IngredientServiceImpl(RecipeRepository recipeRepository, IngredientToIngredientCommand ingredientToIngredientCommand) {
        this.recipeRepository = recipeRepository;
        this.ingredientToIngredientCommand = ingredientToIngredientCommand;
    }

    @Override
    public IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId) {
        Optional<Recipe> optionalRecipe = recipeRepository.findById(recipeId);
        if(optionalRecipe.isPresent()){
            log.error("Recipe is not found, id = " + recipeId);
        }
        Recipe recipe = optionalRecipe.get();
        Optional <IngredientCommand> optionalIngredientCommand = recipe.getIngredients().stream()
                .filter(ingredient -> ingredient.getId().equals(ingredientId))
                .map(ingredient -> ingredientToIngredientCommand.convert(ingredient)).findFirst();

        return optionalIngredientCommand.get();
    }
}
