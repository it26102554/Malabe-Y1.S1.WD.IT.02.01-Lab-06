import java.util.Scanner;

public class IT26102554Lab6Q3
{
    public static void main(String[] args)
    {
        int num;
        int count = 0;
        double totalOfSquares = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        num = input.nextInt();

        while (num != -99)
        {
            if (num > 0)
            {
                totalOfSquares += (double) num * num;
                count++;
            }
            else
            {
                System.out.println("Invalid input");
            }

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        if (count > 0)
        {
            double meanSquare = totalOfSquares / count;
            double rms = Math.sqrt(meanSquare);
            System.out.println("The root mean square (RMS) is: " + rms);
        }
        else
        {
            System.out.println("No valid numbers were entered.");
        }
    }
}
