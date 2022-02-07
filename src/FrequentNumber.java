import java.util.ArrayList;
import java.util.List;

public class FrequentNumber {

	public static void main(String[] args) {
		
		//Initialize Variables 
		int inputList [] = {3, 5, 7, 8, 8, 8, 3, 9, 1, 2, 3, 7, 8, 5, 4, 3, 2, 0};
		int countArr  []  = new int[inputList.length] ;
		int count;
		List<Integer> lstMax = new ArrayList<>();
		int maxCount = 0;
				
		//cycle the input array and count the number of duplicates of each position
		//Put that count in another array in the same position as the input array
		for (int x = 0; x < inputList.length; x++) {
			count=1;
			for (int z = x+1; z < inputList.length; z++) {
			  if (inputList[x]== inputList[z]) {
				count ++;
				countArr [x] = count;
			}
		
			} 	
		}
		//Cycle the array and check the most  frequent numbers in the array using the 
		for (int x = 0; x < inputList.length; x++) {
			if (countArr[x]>maxCount) {
				maxCount = countArr[x];
				lstMax.clear();
			} 	
			if (countArr[x]==maxCount){
				lstMax.add(inputList[x]);
			}
		}
			
	    //Print the results
		if ( lstMax.size() == 1) {
			System.out.println( " The most frequent number is "+ lstMax.get(0) + " with "+maxCount+" occurences" );  
		}
		else {
			System.out.println( "List of  most frequent numbers with "+maxCount+" occurences each:" ); 
			for (int i = 0; i <lstMax.size(); i++) {     
		           System.out.println(lstMax.get(i)); 
		}
	   
	    } 
	}

}