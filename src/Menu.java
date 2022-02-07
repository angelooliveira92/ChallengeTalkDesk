import java.util.*;

public class Menu {
	    public static void printMenu(String[] options){
	        for (String option : options){
	            System.out.println(option);
	        }
	        System.out.print("Choose your option : ");
	    }
	    public static void main(String[] args) {
	        String options = "1- Longest word(s) in the  phrase\n"+
	                            "2- Sorting an array\n"+
	                            "3- Most frequent number(s) in the array\n"+
	                            "4- Exit";
	        String mismatchExc = "Please enter an integer value between 1 and 4";	        
	        Scanner scanner = new Scanner(System.in);  
	        int option = 1;
	        
	        while (option!=4){
	            try {
	            	System.out.println(options);
	            	System.out.print("Option: ");
	            	System.out.println();
	                option = scanner.nextInt();
	                switch (option) {
					case 1:
						LongestWord.main(null);
						break;
					case 2 :
						Sorting.main(null);
						break;
					case 3:
						FrequentNumber.main(null);
						break;	

					default:
						System.out.println(mismatchExc);
						break;
					}
	                System.out.println();
	            }
	            
	            catch (InputMismatchException ex){
	                System.out.println(mismatchExc);
	                scanner.next();
	            }
	            catch (Exception ex){
	                System.out.println("An unexpected error happened. Please try again");
	                scanner.next();
	            }
	        }
	        scanner.close();
	    }
	}

