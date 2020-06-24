package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class HashtagsControllerTest {
    CategoryStorage mockCategories = mock(CategoryStorage.class);
    HashtagsStorage mockHashtags = mock(HashtagsStorage.class);
    HashtagsController underTest = new HashtagsController(mockHashtags, mockCategories);

    @Test
    public void shouldReturnHashtagTemplate() {
        Model model = mock(Model.class);
        String templateName = underTest.showSingleHashtag("Ben", model);
        assertThat(templateName).isEqualTo("hashtag-template");
    }

    @Test
    public void shouldShowHashtagContent() {
        Model model = mock(Model.class);
        underTest.showSingleHashtag("Ben", model);
        verify(mockHashtags).findHashtagByName("Ben");
        verify(mockCategories).getAllCategories();
    }

    @Test
    public void shouldAddHashtagToModel() {
        Model model = mock(Model.class);
        Hashtags testHashtag = new Hashtags("Test Hashtag");
        when(mockHashtags.findHashtagByName("Ben")).thenReturn(testHashtag);
        underTest.showSingleHashtag("Ben", model);
        verify(model).addAttribute("hashtag", testHashtag);
    }
}
