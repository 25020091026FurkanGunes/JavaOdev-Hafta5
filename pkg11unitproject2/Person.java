package pkg11unitproject2;


public class Person {
    private String name;
    private String adress;
    private String mail;
    private long phone;

    public Person() {
    }
    

    public Person(String name, String adress, String mail, long phone) {
        this.name = name;
        this.adress = adress;
        this.mail = mail;
        this.phone = phone;
    }

   
    public String getName() {
        return name;
    }

    
    public String getAdress() {
        return adress;
    }

    
    public String getMail() {
        return mail;
    }

    
    public long getPhone() {
        return phone;
    }
    
    
@Override
    public String toString(){
    
        return "Sinif: Person, Ad: " + getName();
    } 
}
