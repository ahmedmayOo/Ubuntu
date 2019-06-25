
public class Person {
	// property 
	static boolean haveBlod = true;
	static int COUNTER  = 0;
	
	// instance variables 
	double age;
	String name;
	int zipcode;
	String phone;
	
	
	// Constructor 
	
	// No- arg constructor
	public Person( ) {}
	
	// Parameterized constructor
	public Person(int x ) {
		COUNTER ++;
		System.out.println("inside the constructor");
		System.out.println(COUNTER);
	}
	
	public Person(double age, String name, int zipcode, String phone) {
		this.age = age;
		this.name = name;
		this.zipcode = zipcode;
		this.phone = phone;
		age = 10;
		this.age = 10;
	}
	
	// Methods belongs to instance or object
	public void setAge(double age) {
		this.age = age;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getAge() {
		return age;
	}
	

}
