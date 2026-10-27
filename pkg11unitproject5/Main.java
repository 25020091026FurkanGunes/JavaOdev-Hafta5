
package pkg11unitproject5;


public class Main {

    
    
    public static void main(String[] args) {
        Course c1=new Course("DNA");
  
        c1.addStudents("Furkan");
        c1.addStudents("Ecrin");
        c1.addStudents("Yakup");
        c1.addStudents("Hasan");
        c1.addStudents("Fatih");
        c1.clear();
        c1.addStudents("Fatih");
        c1.addStudents("Hasan");
        c1.dropStudents(0);


        
        System.out.println(c1.getStudents());
    }
    
}
