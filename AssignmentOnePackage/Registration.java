/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentOnePackage;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Michelle
 */
public class Registration {

List<Student> studentlist = new ArrayList<Student>();
public void createStudent(int id, String name, String course) {
List<String> def= new ArrayList<String>();
def.add(course);
Student stu_1 = new Student(id, name, def);
studentlist.add(stu_1);
}
public void deleteStudent(int id) {
    for(int i=0; i< studentlist.size(); i++) {
    if(studentlist.get(i).id == id){
    studentlist.remove(i);
    }

    }
}
public void addcourse(int id, String course) {
    for(int i = 0; i< studentlist.size(); i++) {
    
    if(studentlist.get(i).id == id) {
    
    }
    }
}
public List<Student> getallstudent(){
return studentlist;
}
     public void print() {
     
     for(int i=0; i< studentlist.size(); i++) {
     Student a = studentlist.get(i);
     System.out.println(a.getId() + a.getName() + a.getCourselist());
     
     }
     }


}
