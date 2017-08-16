
public class Array {
	public static void main(String[] args) {

		String[] animals = {"dog", "cat", "elephant", "owl"};
		Integer[] age = new Integer [animals.length];
	age[0] = 3;
	age[1] = 17;
	age[2] = 10;
	age[3] = 1245;
	for(int i = 0; i < animals.length; i++) {
		System.out.println("The " + animals[i]  + " is " + age[i] + " years old");
	}
	
	
	}
}
