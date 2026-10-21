import java.util.Scanner;

public class IT26102554Lab6Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number=input.nextInt();
		
		int square;
		double squareroot;
		square=number*number;
		squareroot=Math.sqrt(number);
		System.out.println("Square value of "+ number +"is" +square);
		System.out.println("Square root value of " + number +"is" + squareroot);
	}
}