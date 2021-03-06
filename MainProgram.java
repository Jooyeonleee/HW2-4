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
        else if (studentID == 1715813) hw_1715813();
        else if(studentID == 1810052) calc_1810052();
        else if (studentID == 1810108) hw_1810108();
        else if (studentID == 1715295) hw_1715295();
        else if (studentID == 1715168) hw_1715168();
        else if (studentID == 1716353) hw_1716353(studentID);
        else
            System.out.println("To be developed...\n");
    }
    
    public void hw_1716353(int sid) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("[Student ID: " + sid + "]"); // print my student ID
    	System.out.println("		1. Calculate Absolute Value of the Number");
    	System.out.println("		2. Calculate Max Value");
    	System.out.print("Enter menu number: ");
    	
    	int menu = scan.nextInt();  // 
    	
    	if (menu == 1) { // 1. Calculate Absolute Value of the Number
    		System.out.print("Enter One Number: ");
    		int num = scan.nextInt();    		

    		System.out.println("The Result is: " + calc1_1716353(num)+"\n");
    	}
    	else if(menu == 2)  { // 2. Calculate Max Value
    		System.out.print("Enter Two Number: ");
    		int a = scan.nextInt(); 
    		int b = scan.nextInt();

    		System.out.println("The Result is: " + calc2_1716353(a,b)+'\n');
    	}
    	else {System.out.println("wrong number");}
    }
    
    public int calc1_1716353(int a) { //ABS
    	if (a>= 0)
    		return a;
    	else 
    		return -a;
    }
    
    public int calc2_1716353(int a, int b) { //MAX
    	if (a >= b) return a;
    	else return b;
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

	public void hw_1715295(){
	    int num;
    	int select;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("[Student ID: 1715295]");
    	System.out.println("1. Calculate factorial value");
    	System.out.println("2. Calculate cube value");
    	System.out.print("Enter menu number: ");
    	select = scan.nextInt();
    	System.out.println();
    	System.out.print("Enter an Integer: ");
		num = scan.nextInt();
    	if (select==1)	System.out.println("Result : "+ factorial_1715295(num));
    	else if (select==2)	System.out.println("Result: "+ cube_1715295(num));
    	System.out.println();
	}
    
    public int factorial_1715295(int a) {
    	if(a==0) return 1;
    	if (a < 2) return a; 
    	else	return a*factorial_1715295(a-1);	
    }
    
    public int cube_1715295(int a) {
    	return a*a*a;
    }

	public void hw_1715168 () {
		printMenu_1715168();
		int menuNumber = getNumber_1715168();
		if (menuNumber == 1) {
			System.out.println("\nYou choose [1. Calculate power]");
			printInputGuide_1715168("a^2");
			int a = getNumber_1715168();
			int answer = calculateSquare_1715168(a);
			printAnswer_1715168(answer);
		}
		else if (menuNumber == 2) {
			System.out.println("\nYou choose [2. Calculate absolute value]");
			printInputGuide_1715168("|a|");
			int a = getNumber_1715168();
			int answer = calculateAbsValue_1715168(a);
			printAnswer_1715168(answer);
		}
	}

	public void printMenu_1715168 () {
		System.out.println("[Student ID: 1715168]");
		System.out.println("1. Calculate square");
		System.out.println("2. Calculate absolute value");
		System.out.print("Enter menu number: ");
	}

	public int calculateSquare_1715168(int operand) {
		return operand*operand;
	}

	public int calculateAbsValue_1715168(int operand) {
		if(operand < 0) return -operand;
		else return operand;
	}

	public int getNumber_1715168() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	public void printInputGuide_1715168(String calculationTodo) {
		System.out.println("I will calculate " + calculationTodo);
		System.out.print("Please enter the number a: ");
	}

	public void printAnswer_1715168 (int answer) {
		System.out.println("The answer is " + answer + "\n");
	}
}