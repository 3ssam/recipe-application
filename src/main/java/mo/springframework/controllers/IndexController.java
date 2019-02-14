package mo.springframework.controllers;

import mo.springframework.domain.Category;
import mo.springframework.domain.UnitOfMeasure;
import mo.springframework.repositories.CategoryRepository;
import mo.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/Index"})
    public String getIndexPage(){
        Optional<Category> category = categoryRepository.findByDescription("fs");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Pinch");
        System.out.println(category.get().getId());
        System.out.println(unitOfMeasure.get().getId());
        return "Index";
    }
}
