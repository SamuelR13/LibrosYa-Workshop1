package io.riwi.LibrosYa.api.dto.request;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    @NotBlank(message = "title is required")
    @Size(max = 100, message = "title must be less than 100 characters")
    private String title;
    @NotBlank(message = "author is required")
    @Size(max = 100, message = "author must be less than 100 characters")
    private String author;
    @NotBlank(message = "publication_year is required")
    @Size(max = 11, message = "publication_year must be less than 11 characters")
    private String publication_year;
    @NotBlank(message = "genre is required")
    @Size(max = 50, message = "genre must be less than 50 characters")
    private String genre;
    @NotBlank(message = "isbn is required")
    @Size(max = 20, message = "isbn must be less than 20 characters")
    private String isbn;
}
