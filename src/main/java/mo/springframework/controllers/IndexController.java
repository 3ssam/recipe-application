package mo.springframework.controllers;

import lombok.extern.slf4j.Slf4j;
import mo.springframework.domain.Category;
import mo.springframework.domain.UnitOfMeasure;
import mo.springframework.repositories.CategoryRepository;
import mo.springframework.repositories.UnitOfMeasureRepository;
import mo.springframework.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private RecipeService recipeService;

    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/Index"})
    public String getIndexPage(Model model){
//        Optional<Category> category = categoryRepository.findByDescription("fs");
//        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Pinch");
//        System.out.println(category.get().getId());
//        System.out.println(unitOfMeasure.get().getId());
        model.addAttribute("recipes",recipeService.getRecipes());
        return "Index";
    }
}
