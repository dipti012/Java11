//Write a program to demonstrate the `delete()` method.
public class Example9{
    public static void main(String[] args){
        StringBuffer obj = new StringBuffer("hello world");
        obj.delete(5,11);
        System.out.println(obj);

    }
}