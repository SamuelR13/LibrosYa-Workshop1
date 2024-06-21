package io.riwi.LibrosYa.api.dto.request;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern.Flag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 50,message = "Username must be between 3 and 50 characters") 
    private String username;
    @NotBlank(message = "password is required")
    @Size(min = 8, max = 100,message = "password must be between 8 and 100 characters")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$",
            message = "password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character")
    private String password;
    @NotBlank(message = "email is required")
    @Size(max = 100,message = "email must be less than 100 characters")
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Flag.CASE_INSENSITIVE,
            message = "email is invalid")
    private String email;
    @NotBlank(message = "full_name is required")
    @Size(max = 100,message = "full_name must be less than 100 characters") 
    private String full_name;
    @NotBlank(message = "role is required")
    @Size(max = 20,message = "role must be less than 20 characters") 
    private String role;
}
