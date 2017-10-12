
public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
Vault vault2 = new Vault();
		JBondVault jbv = new JBondVault();
		jbv.guessCode(vault);
		jbv.guessCode(vault2);
	}
}
