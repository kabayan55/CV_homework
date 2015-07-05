import java.awt.*;


public class TilingBlue1 {


	static MyImage execute(MyImage input1) { 

		int width1 = input1.width;
		int height1 = input1.height;

		int width  = width1*6;
		int height = height1;
	
		MyImage output = new MyImage(width, height);

	
		for(int i = 0; i < height; i++) {
		    for(int j = 0; j < width; j++) {
				if(i < height1 && j < width1) {
				    Color color1 = input1.getColor(j, i);
				    output.setColor(j, i, color1);
				    output.setColor(j+width1, i, color1);
				    output.setColor(j+width1*2, i, color1);
				    output.setColor(j+width1*3, i, color1);
				    output.setColor(j+width1*4, i, color1);
				    output.setColor(j+width1*5, i, color1);
				}

				else{break;}
		    }
		}
		
		return output;
		
	}

}