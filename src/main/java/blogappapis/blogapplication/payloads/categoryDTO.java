package blogappapis.blogapplication.payloads;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class categoryDTO {

    private Integer categoryId;
    @NotEmpty
    private String categoryTitle;
    @NotEmpty
    private String description;

}
