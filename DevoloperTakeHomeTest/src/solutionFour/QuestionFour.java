package solutionFour;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class QuestionFour {
	
	  public static void mostFrequent(int a[], int n) 
	    { 
		  
		  HashMap<Integer, Integer> freqCountMap 
          = new HashMap<Integer, Integer>(); 
		  
		  for (int i : a) {
			  if (freqCountMap.containsKey(i)) {
				  freqCountMap.put(i, freqCountMap.get(i) + 1);
			  }
			  else {
				  freqCountMap.put(i, 1);
				  
			  }
			   
		  }
		  
		  int maxValueInMap=(Collections.max(freqCountMap.values()));  // This will return max value in the Hashmap
		  List<Integer> output = new ArrayList<Integer>();  
		  for (Entry<Integer, Integer> entry : freqCountMap.entrySet()) {  // Itrate through hashmap
	            if (entry.getValue()==maxValueInMap) {
	                 
	                output.add(entry.getKey());
	                
	               
	            }
	            
	        }
		  System.out.println(output);
		  
	    }
	    // Driver program 
	    public static void main (String[] args) { 
	          
	        int arr[] = {1, 2, 3, 4, 5, 1, 6, 7};  
	       mostFrequent(arr, arr.length); 
	       int arr1[]= {5, 4, 3, 2, 4, 5, 1, 6, 1, 2, 5, 4};
	       mostFrequent(arr1,arr1.length); 
	       int arr2[]= {1, 2, 3, 4, 5, 6, 7};
	       mostFrequent(arr2,arr2.length);  
	    } 
	

}
