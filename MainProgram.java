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
        else if(studentID == 1810052) calc_1810052();
        else if (studentID == 1810108) hw_1810108();
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
    
    public int max_1715813(int num1, int num2) {
    	if(num1 > num2)
    		return num1;
    	else 
    		return num2;
    }
    
    public int min_1715813(int num1, int num2) {
    	if(num1 < num2)
    		return num1;
    	else 
    		return num2;
    }
    
    
    public void calc_1810052() {
    	double num;
    	int select;
    	Scanner scan_0052 = new Scanner(System.in);
    	System.out.println("[Student ID: 1810052]");
    	System.out.println("1. Calculate absolute value");
    	System.out.println("2. Calculate floor value");
    	System.out.print("Enter menu number: ");
    	select = scan_0052.nextInt();
    	System.out.println();
	System.out.print("Enter a number to calculate: ");
	num = scan_0052.nextDouble();
    	if(select==1)	System.out.println("Absolute value of entered number: "+absolute_1810052(num));
    	else if(select==2)	System.out.println("Floor value of entered number: "+floor_1810052(num));
    	System.out.println();
    }
    
    public double absolute_1810052(double a){
    		if(a<0) return -a;
    		else return a;
    }

    public int floor_1810052(double a){
    	if(a%1==0) return (int)a;
    	else if(a<0) return (int)a-1;
    	else return (int)a;
    }
    


    public void hw_1810108(){
	    double a;
    	int select;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("[Student ID: 1810108]");
    	System.out.println("1. Calculate absolute value");
    	System.out.println("2. Calculate squared value");
    	System.out.print("Enter menu number: ");
    	select = scan.nextInt();
    	System.out.println();
    	System.out.print("Enter an Integer: ");
		a = scan.nextDouble();
    	if (select==1)	System.out.println("Result : "+ ab_1810108(a));
    	else if (select==2)	System.out.println("Result: "+ sq_1810108(a));
    	System.out.println();
	}

	private double ab_1810108(double a){
		if (a<0) return -a;
		else return a;
	}
	
	private double sq_1810108(double a){
		return a*a;
	}

    
    
    
}
