import java.util.Scanner;

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
        else if (studentID == 1715813)
        	hw_1715813();
        else
            System.out.println("To be developed...\n");
    }
    
    public void hw_1715813() {
    	int result;
    	int num1;
    	int num2;
    	Scanner scan = new Scanner(System.in);
    	int menuNumber = printMenu_1715813();
    	
    	System.out.print("input two numbers: ");
    	num1 = scan.nextInt();
    	num2 = scan.nextInt();
        
    	if (menuNumber == 1)
    		result = max_1715813(num1, num2);
    	else
    		result = min_1715813(num1, num2);
    	System.out.println("Result: " + result);
    	System.out.println();
    }
    
    public int printMenu_1715813() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("1. Calculate max");
    	System.out.println("2. Calculate min");
    	System.out.print("Enter menu number: ");
    	return scan.nextInt();
    }
    
    private int max_1715813(int num1, int num2) {
    	if(num1 > num2)
    		return num1;
    	else 
    		return num2;
    }
    
    private int min_1715813(int num1, int num2) {
    	if(num1 < num2)
    		return num1;
    	else 
    		return num2;
    }
}