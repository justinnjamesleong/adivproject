package sg.nus.iss.adprojectTeam5api.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Movie")
public class Movie {
    @Id
    private int id;

    @Column(name = "moviename")
    private String movie_name;


    // public Movie(int movie_id, String movie_name){
    //     this.movie_id=movie_id;
    //     this.movie_name=movie_name;
    // }
}
