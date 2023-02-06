package sg.nus.iss.adprojectTeam5api.Model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class TmdbApiResponse {
    private int page;
    private int totalPages;
    private int totalResults;
    private List<Movie> results;

    // Add getters and setters for each field
}