import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }


public void runModule(int studentID) { 
         if (studentID == 11530) 
             System.out.println("No. It is the professor ID.\n"); 
        else if (studentID == 1716619) 
        	hw_1716619(); 
         else 
             System.out.println("To be developed...\n"); 
} 
      
     public void hw_1716619() { 
     	int result; 
     	int num; 
     	Scanner scan = new Scanner(System.in); 
     	int menuNumber = printMenu_1716619(); 
     	 
     	System.out.print("input one number: "); 
     	num = scan.nextInt(); 

          
     	if (menuNumber == 1) 
     		result = factorial(num); 
     	else 
     		result = absolute(num); 
     	System.out.println("Result: " + result); 
     	System.out.println(); 
     } 
      
     public int printMenu_1716619() { 
     	Scanner scan = new Scanner(System.in); 
     	System.out.println("1. Calculate factorial"); 
     	System.out.println("2. Calculate absolute value"); 
     	System.out.print("Enter menu number: "); 
     	return scan.nextInt(); 
     } 
      
     public int factorial(int num) { 
    	 if (num==0) return 1;
    	 else {
    		int fac=num;
    	    for(int i=num-1;i>0;i--)
    		   fac*=i;
    		   
     		return fac; 
    	 }
     }
      
    public int absolute(int num) { 
     	if(num< 0) 
     		return -num; 
     	else  
     		return num; 
     } 

}