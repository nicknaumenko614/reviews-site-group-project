package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class CategoryControllerTest {
    CategoryStorage mockStorage = mock(CategoryStorage.class);
    CategoryController underTest = new CategoryController(mockStorage);

    @Test
    public void shouldReturnCategoryTemplate() {
        Model model = mock(Model.class);
        String templateName = underTest.showSingleCategory("Actor", model);
        assertThat(templateName).isEqualTo("category-template");

    }

    @Test
    public void shouldShowCategoryContent() {
        Model model = Mockito.mock(Model.class);
        underTest.showSingleCategory("Actors", model);
        verify(mockStorage).findCategoryByName("Actors");
        verify(mockStorage).getAllCategories();
    }

    @Test
    public void shouldAddCategoryToModel() {
        Model model = Mockito.mock(Model.class);
        Category testCategory = new Category("Test Category");
        when(mockStorage.findCategoryByName("Actors")).thenReturn(testCategory);
        underTest.showSingleCategory("Actors", model);
        verify(model).addAttribute("category", testCategory);
    }
}


