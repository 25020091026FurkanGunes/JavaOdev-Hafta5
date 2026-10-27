package pkg11unitproject5;
import java.util.ArrayList;

public class Course {

   private String courseName;
   private ArrayList<String> students;
   private int numberOfStudents;

    public Course(String courseName) {
        this.courseName=courseName;
        this.students=new ArrayList<>();
    }
   

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public void addStudents(String student){
        students.add(student);
    }
    public void dropStudents(int index){
        if(index>=0&&index<students.size()){
        students.remove(index);
        }
        
    }
    
    public void clear(){
    students.clear();
    }
    

    
   
   
   

    
    

    
}
