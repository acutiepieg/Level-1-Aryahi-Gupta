
public class IceCreamVotes {
	private String flavor;
	private String personName;
	private static int numVotes;
	
	public IceCreamVotes(String flavor, String personName) {
	numVotes++;
	this.flavor = flavor;
	this.personName = personName;
	
	}
public void setFlavor(String flavor){
	this.flavor = flavor;
}
public void setpersonName(String personName){
	this.personName = personName ;
} 
public String getFlavor() {
	return flavor;
	
} 
public String getPersonName() {
	return personName;
	
} 
static public int getNumVotes() {
	return numVotes;
	
} 
}
