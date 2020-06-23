package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HomeControllerTest {
    CategoryStorage mockCategories = mock(CategoryStorage.class);
    HashtagsStorage mockHashtags = mock(HashtagsStorage.class);
    HomeController underTest = new HomeController(mockHashtags, mockCategories);

    @Test
    public void shouldReturnHomeTemplate() {
        Model model = mock(Model.class);
        String templateName = underTest.showHome(model);
        assertThat(templateName).isEqualTo("home-template");
    }
    @Test
    public void shouldShowAllCategories(){
        Model model = mock(Model.class);
        underTest.showHome(model);
        verify(mockCategories).getAllCategories();
    }
    @Test
    public void shouldShowAllHashtags(){
        Model model = mock(Model.class);
        underTest.showHome(model);
        verify(mockHashtags).getAllHashtags();
    }
}
