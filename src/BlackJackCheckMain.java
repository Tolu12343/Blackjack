import java.util.Scanner;
public class BlackJackCheckMain {
   public static void main(String[] args) {
	   Scanner user_input = new Scanner(System.in);
	   System.out.println("Please enter the first number");
	   int firstNum = user_input.nextInt();
	   System.out.println("Please enter the second number");
	   int secondNum = user_input.nextInt();
	   int finalresult = IntegerManipulate.integerCheck(firstNum, secondNum);
	   System.out.println("The number closer to 21 is: "+ finalresult);
	   
   }
}
