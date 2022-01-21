import java.util.Scanner;
class Vishu
  {  
     public static void main(String xy[])
      {  
        int sub , mult , div ,num1,num2,sum;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1st no");
            num1 = sc.nextInt();
                System.out.println("Enter 2st no");
                num2= sc.nextInt(); 
              
                sum = num1 + num2;
                System.out.println("The addition is ="+sum);

                sub = num1 - num2;
                System.out.println("The substraction is ="+sub);
             
                mult = num1 * num2;
                System.out.println("The multiplication is ="+mult);
        
                div= num1 / num2;
                System.out.println("The div is ="+div);
        }
}