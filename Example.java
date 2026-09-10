//Create an Employee class with :
// id 
// name
//salary
//create a paramitalized constrouctor to initiallized all three values.
//create a method displayEmployee() to dispaly the employee information.
//create three employee object in main().
class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
        public void displayEmployee(){
            System.out.println("Employee id :" + id);
            System.out.println("Employee name:" + name);
            System.out.println("Employee salary:" + salary);

        }
    }
public class Example {
    public static void main(String[] args){
        Employee e1 = new Employee(1 , "hari" , 1000);
        e1.displayEmployee();
    }
}