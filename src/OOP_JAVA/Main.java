package OOP_JAVA;

public class Main {

	public static void main(String[] args) {

		Student paatu = new Student();
		Student student = new Student(15, "Luswata", 98.7f);
//		paatu.rollNo = 14;
//		paatu.marks = 98.2f;
//		paatu.name = "Seremba Paatu";
//		paatu.changeGreeting("Praise God");

		paatu.greeting();
		System.out.println(paatu.rollNo);
		System.out.println(paatu.name);
		System.out.println(paatu.marks);
	}
// create a class
static class Student {
		int rollNo;
		String name;
		float marks;

		void greeting (){
			System.out.println("My name is " + this.name);
		}
		void changeGreeting(String newGreeting) {
			name = newGreeting;
		}

		Student(){
			this.rollNo = 13;
			this.name = "seremba paatu";
			this.marks = 98.4f;
		}
		// you can also pass on parameters
	    Student(int roll, String name, float marks){
			this.rollNo = roll;
			this.name = name;
			this.marks = marks;
	    }

}
}
