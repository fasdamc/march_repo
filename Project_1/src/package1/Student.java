package package1; //a collection of similar items

public class Student { //contains variable + method(for performing an action/operation)
	int age;
	int rollno;
	public void display1() //method 
	{
		System.out.println("Welcome to all of you!");
	}
	public void display2() {
		System.out.println("Automation is very easy!");
	}
	public static void main(String[] args) { //main method(main+space). code execution starts here.
		//create object in main method to call/access variables and methods of the class. class_name ref_var_name = new class_name();
		Student ref_var_1 = new Student();
		ref_var_1.display1(); //calling method
		ref_var_1.display2(); 
		ref_var_1.age = 120; //calling variable and assigning value
		ref_var_1.rollno = 5;
		System.out.println("Age is " + ref_var_1.age); //print var value
		System.out.println("Rollno is " + ref_var_1.rollno);
	}
}
