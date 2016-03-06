//U10316050 ������
import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {
	  public static void main(String[] args) {
		    int number1 = (int)(Math.random() * 10);
		    int number2 = (int)(Math.random() * 10);
		    ArrayList myList = new ArrayList();
		    
		    // Create a Scanner
		    Scanner input = new Scanner(System.in);
		    
		    System.out.print("What is " + number1 + " * " + number2 + "? ");
		    // Scanner answer!
		    int answer = input.nextInt();
		    
		    while (number1 * number2 != answer) {
		    	if(myList.contains(answer)){
		    		System.out.println("You already entered "+answer+"!");// Check answer
		    	}
		    	System.out.print("Wrong answer. Try again. What is " 
		    			+ number1 + " * " + number2 + "? ");
		    	myList.add(answer);
		    	answer = input.nextInt();
		    }

		    System.out.println("You got it!");
		  }
}
