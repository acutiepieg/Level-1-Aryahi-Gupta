import java.util.Random;

public class Vault {
	Random ran = new Random();
	int code = ran.nextInt(1000000);

	public Vault(){
			}
public boolean tryCode(int guess) {
	if (guess == code) {
		System.out.println("The vault is unlocked. The code is " + guess);
		return true;
	}
	else {

		return false;
	}
}
}
