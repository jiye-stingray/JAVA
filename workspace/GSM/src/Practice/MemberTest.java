package Practice;

class Member{
	private String name;
	private int id;
	private String password;
	private int age;
	
	public Member(String name, int id, String password, int age) {
		setName(name);
		setId(id);
		setPassword(password);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class MemberTest{
	public static void main(String[] args) {
		Member p1 = new Member("±è°¨ÀÚ",1,"kim0827!",21);
		System.out.println(p1.getName());
	}

}
