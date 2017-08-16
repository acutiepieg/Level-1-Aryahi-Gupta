
public class Animal {
	private String type;
	private int age;
	private String name;

	private static int count;

	public Animal(String type, int age, String name) {
		this.type = type;
		this.age = age;
		this.name = name;
	count++;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	static public int getCount() {
		return count;
	}
}