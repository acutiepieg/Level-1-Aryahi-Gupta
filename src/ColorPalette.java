import java.awt.Color;

public class ColorPalette {
	static Color c1;
	static Color c2;
	static Color c3;

	public ColorPalette(Color c1, Color c2, Color c3) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}

	static Color getC1() {
		return c1;
	}

	static Color getC2() {
		return c2;
	}

	static Color getC3() {
		return c3;
	}

}
