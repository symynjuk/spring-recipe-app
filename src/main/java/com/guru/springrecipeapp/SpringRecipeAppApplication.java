package com.guru.springrecipeapp;

import com.guru.springrecipeapp.bootstrap.RecipeBootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SpringRecipeAppApplication{


    public static void main(String[] args) {
        SpringApplication.run(SpringRecipeAppApplication.class, args);

    }
}
