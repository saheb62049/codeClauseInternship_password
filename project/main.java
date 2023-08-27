// I am completed my first java project.
// This project is a password Generator using java ?
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of  passwords you want to generate :- ");
        int digit = input.nextInt();
        String lower_cases = "hdfjkhjfhdhihuidshfuh";
        String upper_cases = "HDFKHGKJFGHHDFHGDHFGHHGF";
        
        String password ="";
        for(int i =0; i<digit ; i++){
            int rand =(int)(3*Math.random());
            switch(rand){
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    rand = (int)(lower_cases.length() * Math.random());
                    password += String.valueOf(lower_cases.charAt(rand));
                    break;
                case 2:
                    rand = (int)(upper_cases.length() * Math.random());
                    password += String.valueOf(upper_cases.charAt(rand));
                    break;


            }
        }
        System.out.print(digit +" password are  generator :- "+password);
    }


}
