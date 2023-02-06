package sg.nus.iss.adprojectTeam5api.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;

import com.fasterxml.jackson.annotation.JsonIgnore;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table( name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(max = 120)
    private String password;

    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "role", columnDefinition = "ENUM('ADMIN','USER')")
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(Long id, String username, String email, String password, boolean isActive, RoleEnum role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.role = role;
    }

    public User(String username, String email, String password, boolean isActive, RoleEnum role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
}

// @Entity
// @Table(name = "User")
// public class User implements Serializable {

//   private static final long serialVersionUID = 6529685098267757680L;
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private int id;

//   @NotBlank(message = "{error.user.name.empty}")
//   @Column(name = "name")
//   private String name;

//   @NotBlank(message = "{error.user.password.empty}")
//   @Column(name = "password")
//   private String password;

//   @Column(name="isActive")
//    private boolean isActive;

//    @Column(name = "role", columnDefinition = "ENUM('ADMIN','REGUSER')")
//   @Enumerated(EnumType.STRING)
//   private RoleEnum role;

//     // @OneToMany(targetEntity = Favourite.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
//     // @JsonIgnore
//     // private List<Favourite> favourites;


//   public User() {}

//   public User(int id,String name, String password, boolean isActive, RoleEnum role) {
//       this.id=id;
//       this.name = name;
//       this.password = password;
//       this.isActive = isActive;
//       this.role=role;
//     }

// //  public User(int userId) {
// //    this.userId = userId;
// //  }

//   public int getUserId() {
//     return id;
//   }

//   public void setUserId(int userId) {
//     this.id = userId;
//   }

//   public String getName() {
//     return name;
//   }

//   public void setName(String name) {
//     this.name = name;
//   }

//   public String getPassword() {
//     return password;
//   }

//   public void setPassword(String password) {
//     this.password = password;
//   }

//   public boolean getIsActive(){
//     return isActive;
//   }

//   public void setIsActive(boolean isActive){
//     this.isActive = isActive;
//   }
//   public RoleEnum getRole(){
//     return role;
//   }
//   public void setRole(RoleEnum role){
//     this.role=role;
//   }

// }

