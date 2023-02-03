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

@Entity
@Table(name = "User")
public class User implements Serializable {
  
  private static final long serialVersionUID = 6529685098267757680L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @NotBlank(message = "{error.user.name.empty}")
  @Column(name = "name")
  private String name;
  
  @NotBlank(message = "{error.user.password.empty}")
  @Column(name = "password")
  private String password;
  
  @Column(name="isActive")
   private boolean isActive;

   @Column(name = "role", columnDefinition = "ENUM('ADMIN','REGUSER')")
  @Enumerated(EnumType.STRING)
  private RoleEnum role;

    // @OneToMany(targetEntity = Favourite.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    // @JsonIgnore
    // private List<Favourite> favourites;


  public User() {}
  
  public User(int id,String name, String password, boolean isActive, RoleEnum role) {
      this.id=id;
      this.name = name;
      this.password = password;
      this.isActive = isActive;
      this.role=role;
    }

//  public User(int userId) {
//    this.userId = userId;
//  }

  public int getUserId() {
    return id;
  }

  public void setUserId(int userId) {
    this.id = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  public boolean getIsActive(){
    return isActive;
  }

  public void setIsActive(boolean isActive){
    this.isActive = isActive;
  }
  public RoleEnum getRole(){
    return role;
  }
  public void setRole(RoleEnum role){
    this.role=role;
  }

}

