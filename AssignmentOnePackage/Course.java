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
public class Course {
    
List<String> courselist;

public Course (List<String> acourselist){
courselist = acourselist; 
}
public List<String> getCourselist() {
return courselist;
}

public void setCourselist(List<String> courselist) {
this.courselist = courselist;
}
}

