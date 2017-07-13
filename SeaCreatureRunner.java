
public class SeaCreatureRunner {

	public static void main(String[] args) {
SeaCreature spongeBob = new SeaCreature("SpongeBob");
SeaCreature patrick = new SeaCreature("Patrick");
SeaCreature squidward = new SeaCreature("Squidward");

System.out.println(squidward.getName());
squidward.eat();
System.out.println(spongeBob.getName());
spongeBob.eat();
System.out.println(patrick.getName());
patrick.eat();
patrick.laugh();

	}
	}
