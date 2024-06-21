package io.riwi.LibrosYa.api.dto.request;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    @NotBlank(message = "reservation date is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "reservation date must be in the format YYYY-MM-DD")
    private LocalDate reservation_date;
    @NotBlank(message = "status is required")
    @Size(max=20,message = "status must be less than 20 characters")
    private String status;  
    private String user_id;
    private String book_id;
    
}
