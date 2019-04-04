package mo.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void Setup(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long IdValue = 4L;
        category.setId(IdValue);
        assertEquals(IdValue,category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}