/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentOnePackage;
import java.util.List;
/**
 *
 * @author Michelle
 */
public class Student {

  int id;
  String name;
  
  public Student(int aid, String aname){
  id = aid;
  name = aname;

  }

    Student(int id, String name, List<String> def) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

  
}
