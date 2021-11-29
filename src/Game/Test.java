package Game;

public class Test {
	private int age;
	private String color;
	
	public Test(int age, String color) {
		this.age = age;
		this.color = color;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Test() {
		this(12, "rouge");
	}
	
	public String toString() {
		return "Emilie a " + this.age + " ans et sa couleur préférée est le " + this.color;
	}
}
