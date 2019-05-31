
public class IntegerManipulate {
   public static int integerCheck(int firstNum, int secondNum) {
	   int result=0;
	   if(firstNum> 21) {
		   firstNum =0;
	   }if(secondNum> 21) {
		   secondNum = 0;
	   }
	   int firstdiff = 21 - firstNum;
	   int seconddiff = 21 - secondNum;
	  
	   if(firstdiff > seconddiff ) {
		   result = secondNum;
	   } else if(seconddiff > firstdiff) {
		   result = firstNum;
	   } else {
		   result = 0;
	   }
	  
	   return result;
   }
}
