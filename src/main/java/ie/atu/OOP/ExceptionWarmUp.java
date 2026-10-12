package ie.atu.OOP;

import java.util.Scanner;

public class ExceptionWarmUp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;


        while (!valid)
        {
            System.out.print("Enter a pagecount: ");
            String text = scan.nextLine();
            try
            {
                int pageCount = Integer.parseInt(text);
                System.out.print("You entered: "+ pageCount);
                valid = true;
            }
            catch (NumberFormatException e)
            {
                System.out.print("Invalid Input " + e.getMessage());
            }
        }


    }
}
