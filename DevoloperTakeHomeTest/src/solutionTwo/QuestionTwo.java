package solutionTwo;

import java.util.ArrayList;
import java.util.List;

public class QuestionTwo {
public static  void findPositiveIntegerDivisors(int n) {
	List<Integer> divsorArray = new ArrayList<Integer>();
	
	if (n >= 0) {
		for (int i=1;i<=n;i++) 
            if (n%i== 0) {
            	divsorArray.add(i);
            } 
                System.out.print(divsorArray); 
		
		
	}
	else {
		System.out.println("please enter positive integers");
	}
	
}
public static void main(String args[]) 
{ 
    System.out.println("The divisors of 60 are: "); 
    findPositiveIntegerDivisors(60); 
    System.out.println("\nThe divisors of 42 are: "); 
    findPositiveIntegerDivisors(42); 
} 

}