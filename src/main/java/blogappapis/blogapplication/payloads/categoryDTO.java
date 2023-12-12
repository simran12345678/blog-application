package blogappapis.blogapplication.payloads;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class categoryDTO {

    private Integer categoryId;
    @NotEmpty
    private String categoryTitle;
    @NotEmpty
    private String description;
    private List<postDTO> postDTOList=new ArrayList<>();
}
