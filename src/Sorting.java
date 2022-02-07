 public class Sorting {

	public static void main(String[] args) {
	
		//initialize variables
		String inputList[] = {"jan", "feb", "mar", "apr", "may", "jun", "jul","aug", "sep", "oct", "nov", "dec"};
		String aux = ""; 
	    
		for (int  x = 0; x < inputList.length; x++){  
	    	
	       for (int z = x + 1; z < inputList.length; z++)   
	       {     
	    	 //Compare the current and next position in array and changes the order if necessary
	    	   if (inputList[x].compareTo( inputList[z])>0){  
	    		   //using aux to not lose the value in the original array position
	    		   aux = inputList[x];  
	    		   inputList[x] = inputList[z];  
	    		   inputList[z] = aux;  
	    	   }  
	       }
	    }
	        //Print the result
		System.out.println("Sorted by ascending order: ");    
	       for (int i = 0; i <inputList.length; i++) {     
	           System.out.println(inputList[i]);    
	        } 
	       
		 
	}

}
