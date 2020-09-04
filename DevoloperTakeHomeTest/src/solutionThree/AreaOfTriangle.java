package solutionThree;

public class AreaOfTriangle {
	 public static void main(String[] args) 
    {
		
		 
		 ValidityCheck check = new ValidityCheck();
	    try
	    {
	    	
	      check.checkValidity(3, 4, 5);
	      check.checkValidity(-3, 4, 5);
	     // check.checkValidity(2, 1, 36);
	    }
	    catch (InvalidTriangleException e)
	    {
	    	
	    	System.out.println("Exception Message :"+e.getMessage());
	    	
	    }
	    finally{
	    	 try {
				check.checkValidity(2, 1, 36);
			} catch (InvalidTriangleException e) {
				System.out.println("Exception Message :"+e.getMessage());
			}
	    }
	  }
}
