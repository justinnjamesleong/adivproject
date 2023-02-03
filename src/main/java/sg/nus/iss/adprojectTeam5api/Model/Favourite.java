package sg.nus.iss.adprojectTeam5api.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
// @Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "movie_id" }) })
public class Favourite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "favouriteid")
    private int id;

    @Column(name = "fromdate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fromDate;

    private int movie_id;
    private int user_id;
    public Favourite(int user_id, int movie_id, LocalDate fromDate) {

        this.user_id = user_id;
        this.movie_id = movie_id;
        this.fromDate=fromDate;
    }

}
