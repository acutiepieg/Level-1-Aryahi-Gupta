
public class JBondVault {

	void guessCode( Vault vault) {
	for(int i = 0; i < 1000000; i++) {
		vault.tryCode(i);	
	}
	
}
}
