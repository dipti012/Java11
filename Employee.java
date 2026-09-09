import java.util.Scanner
class Emplooye {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=8 ; i++){
            System.out.print("Enter salary of employee "+ i +":");
            double salary = sc.nextDouble();
            double bonous;
            if(salary < 20000){
                bonous = 0.20 ;
            }else if(salary < 40000){
                bonous = 0.15 ;

            }
        
            }
        }
    }
}