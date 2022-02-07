import java.util.ArrayList;
import java.util.List;


public class 
LongestWord {
  public static void main(String[] args) {
	  
	//Initialize variables
    String inputText = "Ut sit amet urna nec diam auctor tristique ac ac risus. In ut posuere elit. Donec vitae vestibulum dui. Nam tristique convallis ligula vitae pharetra. Vestibulum ac efficitur est. Nullam ac euismod magna. Maecenas dictum arcu tellus, nec tempus orci ultrices ac. Sed ornare ipsum sem, sed venenatis urna maximus a. Vivamus vehicula odio at suscipit ultricies. Morbi velit velit, ultrices eu ligula ac, volutpat tincidunt lectus. Cras tempus lorem et sollicitudin consectetur.";
    List<String> lstLngstWords = new ArrayList<>();
    int maxLength = 0;
    
    //Clear all the non-letters 
    String cleanText = inputText.replaceAll("[^a-zA-Z ]", "");
    
    //Put all the words on a list
    String lstText[] = cleanText.split(" ");
    

    //Cycle the word list and find the max length and the words with max length 
    for(int z=0; z<lstText.length;z++) 
    {
    	if (lstText[z].length() > maxLength) {
    		maxLength = lstText[z].length();
    		lstLngstWords.clear();
    	}
    	if (lstText[z].length() == maxLength ) {
    		
    		lstLngstWords.add(lstText[z]);
    		}
    	 
    	};
    		
   //Print the list of words or the only longest word
    if 	(lstLngstWords.size() == 1)
    {
    	System.out.println("Longest word: "+lstLngstWords.get(0));
    }
    else 
    {
    	System.out.println("List of longest words:");
    	for(int x=0; x<lstLngstWords.size() ;x++)
    		System.out.println(lstLngstWords.get(x));
    }
  }
}