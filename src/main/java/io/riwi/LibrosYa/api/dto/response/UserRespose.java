package io.riwi.LibrosYa.api.dto.response;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRespose {
    private String id;
    private String username;
    private String email;
    private String full_name;
    private String role;
}
