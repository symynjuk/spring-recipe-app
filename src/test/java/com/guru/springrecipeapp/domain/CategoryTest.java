package com.guru.springrecipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {
    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }
    @Test
    public void getId()throws Exception{
        Long idValue = 3L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }
}