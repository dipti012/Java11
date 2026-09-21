//Create a Student class with:

//id
//name
//age
//Create the following overloaded constructors:

//Constructor with no arguments
//Constructor with id and name
//Constructor with id, name, and age
class Student{
    int id;
    String name;
    int age;
    Student(int i ,String n){
    id = i;
    name = n;
    }
    Student(int i, String n, int a){
        id = i;
        name = n;
        age = a;

    }

void displayInformation(){
    System.out.println(id+""+name+""+age);

    
}

}
public class Example2{
    public static void main(String[] args){
        Student s1 = new Student(11, "karan");
        Student s2 = new Student(12, "dipti", 16);
        s1.displayInformation();
        s2.displayInformation();
    }
}