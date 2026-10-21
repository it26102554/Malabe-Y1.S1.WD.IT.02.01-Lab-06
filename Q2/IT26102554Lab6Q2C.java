import java.util.Scanner;
 public class IT26102554Lab6Q2C{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter 10 numbers");
  
  int sum = 0;
  int avg = 0;
  int num = 1;
  String enteredNums =  "";
  while (num <= 10)
  { System.out.print ("Enter number " + num +":"); 
    int count = input.nextInt();
	
    enteredNums = enteredNums + count + " ";
	num++;
	sum = sum + count;
  }
  
  System.out.println("The numbers you entered are : " + enteredNums);
  System.out.println("Sum of the numbers :" + sum);
  System.out.println("Average of the numbers :" + (sum/num ));
  
 }
}