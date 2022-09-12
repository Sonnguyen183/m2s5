package Accessmodifier2;

public class Student {
    private String name;
    private String classes;
    public Student(){
        name = "Son";
        classes = "c07";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public void display(){
        System.out.println("Name" + this.name + "Classes" + this.classes);
    }
}
