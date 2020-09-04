package solutionsOne;

public class QuestionOne {
	public boolean  checkString(String word) {
		try {
		if(word.length() == 0) {
			System.out.println("Input:" +word+"\nOutput:"+true);
			return true;
		}
		else {
			System.out.println("Input:" +word+"\nOutput:"+false);
			return false;
		}
		}
		catch (NullPointerException e){
			System.out.println("Input:" +word+"\nOutput:"+true);
			return true;
		}
		
	}
	
			
	}


