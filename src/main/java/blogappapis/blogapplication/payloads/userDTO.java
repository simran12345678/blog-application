package blogappapis.blogapplication.payloads;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class userDTO {
    private Integer id;

    @NotEmpty
    @Size(min =4,message = "username must be 4 characters")
    private String name;

    @Email(message = "enter a valid email address")
    private String email;

    @NotEmpty
    @Size(min=3,max = 10,message = "password must be min 3 and max 10 chars")
    private String password;

    @NotEmpty
    private String about;
}
