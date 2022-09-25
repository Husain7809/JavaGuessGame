import java.lang.Math;
import java.util.*;
class game {
    public static void main(String[] args) {
       Random r1=new Random();
       Scanner s1=new Scanner(System.in);



       System.out.print("Enter the limit => ");
       int no=s1.nextInt();

       for(int i=1;i<=no;i++)
       {
            int guess_no=r1.nextInt(50); // randome 

            System.out.println("\n\n"+i+" time attempt");

            System.out.print("Enter the number => ");
            int User_no=s1.nextInt();

            if(User_no==guess_no)
            {
                System.out.println("You selected number is:- "+User_no +"\t Guessing Number:- "+guess_no);
                System.out.println("[ You win ]");
            }
            else
            {
                System.out.println("You selected number is:- "+User_no +"\t Guessing Number:- "+guess_no);
                System.out.println("[ You lose ]");
            }

       }

    }
}
