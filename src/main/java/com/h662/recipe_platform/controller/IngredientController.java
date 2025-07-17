package com.h662.recipe_platform.controller;

import com.h662.recipe_platform.dto.IngredientDto;
import com.h662.recipe_platform.dto.IngredientResponseDto;
import com.h662.recipe_platform.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ingredients")
@RequiredArgsConstructor
public class IngredientController {
    private final IngredientService ingredientService;

    @PostMapping
    public IngredientResponseDto create(@Validated @RequestBody IngredientDto dto) {
        return  ingredientService.create(dto);
    }
}
