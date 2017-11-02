import java.awt.Color;

public class PicassoRunner {
 public static void main(String[] args) {
	ColorPalette cp = new ColorPalette(new Color(212,175,55), new Color(175,216,230 ), new Color(0,0,0));
	Picasso pcaso = new Picasso();
	pcaso.drawPic(cp, cp.getC1());
	pcaso.drawPic(cp, cp.getC2());
	pcaso.drawPic(cp, cp.getC3());

}


}

