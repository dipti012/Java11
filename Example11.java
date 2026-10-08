//Write a program to demonstrate using StringBuffer that demonstrate all of the four method:
  //* `append()`
   //* `reverse()`
   //* `delete()`
   //* `insert()`
   public class Example11{
    public static void main(String[] args){
        StringBuffer obj = new StringBuffer("java");
        obj.append("sub");
        System.out.println(obj);
        obj.reverse();
        System.out.println(obj);
    }
   }