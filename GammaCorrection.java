
import java.awt.Color;

public class GammaCorrection {

	public static MyImage execute(MyImage input) {

		MyImage output = new MyImage(input.width, input.height);

		for(int i = 0; i < input.height; i++) {
			for(int j = 0; j < input.width; j++) {

				Color color1 = input.getColor(j, i);
				int R = color1.getRed();
				int G = color1.getGreen();
				int B = color1.getBlue();
			
				double r = 255 * (Math.pow((double)R/255.0, 1.0/2.0));
				double g = 255 * (Math.pow((double)G/255.0, 1.0/0.5));
				double b = 255 * (Math.pow((double)B/255.0, 1.0/0.5));
				Color color2 = new Color((int)r, (int)g, (int)b);

				output.setColor(j, i, color2);
			}
		}
		

		return output;
	}

}