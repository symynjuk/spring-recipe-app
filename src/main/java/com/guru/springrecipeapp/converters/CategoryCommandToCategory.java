package com.guru.springrecipeapp.converters;


import com.guru.springrecipeapp.commands.CategoryCommand;
import com.guru.springrecipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {
    @Override
    @Nullable
    @Synchronized
    public Category convert(CategoryCommand categoryCommand) {
        if (categoryCommand == null){
            return null;
        }
        final Category category = new Category();
        category.setId(categoryCommand.getId());
        category.setDescription(categoryCommand.getDescription());
        return category;
    }
}
