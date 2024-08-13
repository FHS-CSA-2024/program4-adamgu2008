//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4{
    public static void main(String[] args){
        //assign variables
        int no1 = 0;
        int no2 = 0;
        int no3 = 0;
        int no4 = 0;
        
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        no1 = scan1.nextInt();
        
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        no2 = scan2.nextInt();
        
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        no3 = scan3.nextInt();
        
        Scanner scan4 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        no4 = scan4.nextInt();
        
        int sum = no1+no2+no3+no4;
        double average = (double) (sum)/4;
        
        System.out.println("Sum: "+sum);
        System.out.print("Average: "+average);
    }
}

//Paste console output below:
/*
Enter a number: 475
Enter a number: 821
Enter a number: 369
Enter a number: 562
Sum: 2227
Average: 556.75
*/
