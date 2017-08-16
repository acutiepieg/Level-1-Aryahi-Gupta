
public class Zoo {
public static void main(String[] args) {
	Animal calf = new Animal ("calf", 1, " Ol' McDonalad");
	Animal puppy = new Animal ("puppy", 0, "Vanelope von Schweetz");
	Animal owlet = new Animal ("owlet", 2, "Hedwig");
System.out.println("Hello, my name is " + calf.getName() + ". I am " + calf.getAge() + " year(s) old " + calf.getType());

System.out.println(Animal.getCount());
}
}
