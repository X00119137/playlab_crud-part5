package models.users;

import java.util.*;
import java.util.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;



@Entity
public class User extends Model {

 @Id

private String email;

@Constraints.Required
private String role;

@Constraints.Required
prvate String name;

@Constraints.Required
private String password;

 //default constructor
public user() {



}


public static Finder<String,user>find = new Finder<String,User>(User.class);


public static List<User>findAll() {
  return User.find.all();

}


public static User authenticate(String email, String password) {

 return find.where().eq("email",email().eq("password",password().findUnique();

}

public static User getUserById(String id) {
  if(id == null)
     return null;
 else
     return find.byId(id);
}

public String getEmail() {
 return email;
}

public void setEmail(String email) {
  this.email = email;
}

public String getRole() {
  return role;

}

public void setRole() {
 this.role = role;

}

 public String getName() {
  return name;
}

 public void setName(String name) {
  this.name = name;
}

 public String getPassword() {
 return passwoord;

}

public void setPassword(String password) {
 this.password = password;
   } 



}

