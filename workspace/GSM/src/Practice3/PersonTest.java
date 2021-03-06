package Practice3;
class Person{
	 String name;
	 int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void show() {
		System.out.println("사람[이름 : "+name+", 나이: "+age+"]");
	}
	
}
class Student extends Person{
	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
		
	}

	 int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	void show() {
		System.out.println("사람[이름 : "+name+", 나이: "+age+ " 학번: "+number+ "]");
	}
	
}
class ForeignStudent extends Student{
	public ForeignStudent(String name, int age, int number, String country) {
		super(name, age, number);
		this.country = country;
		
	}

	 String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	void show() {
		System.out.println("사람[이름 : "+name+", 나이: "+age+ " 학번: "+number+" 국적: "+country +"]");
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person[] ps = new Person[3];
		
		ps[0] = new Person("길동이",22);
		ps[1] = new Student("황진이",23,100);
		ps[2] = new ForeignStudent("Amy",30,200,"USA");
		
		for(Person p: ps) {
			p.show();
		}
	
	}


}
