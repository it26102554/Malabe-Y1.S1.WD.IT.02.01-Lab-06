import java.util.Scanner;

public class IT26102554Lab6Q2B{
	
    public static void main(String[] args) 
	{
        int number;
		Scanner input = new Scanner(System.in);
		
		
		int count = 1; 

        System.out.println("Enter 10 numbers");
        
        while (count <= 10) 
		{ 
            
            System.out.print("Enter number " + count + ": ");
            int num = input.nextInt();
            
            
            count++;
			
		}
	}
}