package dev.pavan.productservicettsmorningfeb24.dtos;


import dev.pavan.productservicettsmorningfeb24.models.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreCategoryDto {

    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;

    public Category toCategory() {
        Category category1 = new Category();
        category1.setId(id);
        category1.setTitle(title);
        category1.setPrice(price);
        category1.setCategory(category);
        category1.setDescription(description);
        category1.setImage(image);

        return category1;
    }
}

