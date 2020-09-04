package solutionThree;

public class ValidityCheck {
	

	// Method to check lengths are valid to form triangle
	
    public  void checkValidity(int a,int b, int c) throws InvalidTriangleException { 
    	
    	
    	if(a > 0 && b > 0 && c > 0){
    	if(a + b <= c || a + c <= b || b + c <= a) {
    		throw new InvalidTriangleException("Invalid values for forming triangle");
    	}
            else {
            	  int output = ((a+b+c)/2);
            	  System.out.println("Area of Triangle is:"+output);
            }
               
    		
    	}
     
    	
    	else {
    		throw new InvalidTriangleException("Values should not be negitive");
    	}
    	
    } 
}

