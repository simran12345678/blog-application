package blogappapis.blogapplication.payloads;
import blogappapis.blogapplication.entity.Category;
import blogappapis.blogapplication.entity.user;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class postDTO {
    private Integer postId;
    private String title;
    private String content;
    private String imgName;
    private Date date;
    private categoryDTO category;
    private userDTO user;
}
