
public class JBondVault {
public static void main(String[] args) {
	Vault vault = new Vault();
	
	for(int i = 0; i < 1000000; i++) {
		vault.tryCode(i);	
	}
	
}
}
