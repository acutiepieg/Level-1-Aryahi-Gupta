
public class IceCreamVotesRunner {
	public static void main(String[] args) {
		IceCreamVotes[] votes = { new IceCreamVotes("Mint chocalate chip", "Aryahi"),
				new IceCreamVotes("Cappuccino", "Wendy"), new IceCreamVotes("Cookie dough", "Louis"), };
		System.out.println(IceCreamVotes.getNumVotes());
		votes[1].setFlavor("Strawberry");
		for (int i = 0; i < votes.length; i++) {
System.out.println( votes[i].getFlavor() +  " is " + votes[i].getPersonName() + "'s vote." );
		}
	}
}
