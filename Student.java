package programs;

public class Student {

	    String name;
	    int age;

	    // Constructor
	    public Student(String n, int a) {
	        name = n;
	        age = a;
	    }

	    // Display method
	    public void show() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	        Student s = new Student("Manaswini", 20);
	        s.show();
	    }
	}



