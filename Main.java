package poc;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
//	int x=5;
	String Fname="dima";
	String Lname="mashael";
	int age=23;
	static void myStaticMethod() {
		System.out.println("this is an a static method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main myOBJ=new Main();
		Sec myOBJ2=new Sec(7,1996,"mustang");
//		System.out.println(myOBJ.x);
//		myOBJ.x=40; //override existing values
//		System.out.println(myOBJ.x);
//		
		System.out.println("name: "+myOBJ.Fname+" "+myOBJ.Lname);
		System.out.println("my age: "+myOBJ.age);
		myStaticMethod();
		
		
		myOBJ2.fullthrottle();//sec class
		myOBJ2.speed(220);
		System.out.println(myOBJ2.Y);
		System.out.println("model name: "+myOBJ2.ModelName +" /model year: "+myOBJ2.Modelyear);
		
		Car mycar=new Car();
		mycar.honk();
		System.out.println(mycar.brand+" "+mycar.Model);
		
		
		ExtForAbs animal=new ExtForAbs();
		animal.animalsounds();
		animal.sleep();
		
		implclassforanimal pig=new implclassforanimal();
		pig.Animalsound();
		pig.sleep();
		
//		Level Myvar=Level.MEDIUM;
		for(Level Myvar : Level.values()) {
			System.out.println(Myvar); //loop through an enum
		}
//		System.out.println(Level.HIGH);
		
		
		try(Scanner s=new Scanner(System.in)){
		System.out.println("Enter username: ");
		String Username=s.nextLine();
		System.out.println("Username is: "+ Username);}
		
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		
		
		try {
			int[] mynum= {1,2,3};
			System.out.println(mynum[10]);
			
		}catch(Exception e) {
			System.out.println("something went wrong");
		}finally {
			System.out.println("the try catch is finished");
		}
	}

}
