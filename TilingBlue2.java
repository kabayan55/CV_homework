import java.awt.*;


public class TilingBlue2 {


    static MyImage execute(MyImage input1, MyImage input2, MyImage input3, MyImage input4, MyImage input5, MyImage input6) { 

		int width1 = input1.width;
		int height1 = input1.height;
		int width2 = input2.width;
		int height2 = input2.height;
		int width3 = input3.width;
		int height3 = input3.height;
		int width4 = input4.width;
		int height4 = input4.height;
		int width5 = input5.width;
		int height5 = input5.height;
		int width6 = input6.width;
		int height6 = input6.height;

		int width  = width1;
		int height = height1+height2+height3+height4+height5+height6;
	
		MyImage output = new MyImage(width, height);

	
		for(int i = 0; i < height; i++) {
		    for(int j = 0; j < width; j++) {
				if(i < height1 && j < width1) {
				    Color color1 = input1.getColor(j, i);
				    output.setColor(j, i, color1);

				}
				if(i < height2 && j < width2) {
				    Color color2 = input2.getColor(j, i);
				    output.setColor(j, i+height1, color2);
				}
				if(i < height3 && j < width3) {
				    Color color3 = input3.getColor(j, i);
				    output.setColor(j, i+height1+height2, color3);
				}
				if(i < height4 && j < width4) {
				    Color color4 = input4.getColor(j, i);
				    output.setColor(j, i+height1+height2+height3, color4);
				}
				if(i < height5 && j < width5) {
				    Color color5 = input5.getColor(j, i);
				    output.setColor(j, i+height1+height2+height3+height4, color5);
				}
				if(i < height6 && j < width6) {
				    Color color6 = input6.getColor(j, i);
				    output.setColor(j, i+height1+height2+height3+height4+height5, color6);
				}

				else{break;}
		    }
		}
		
		return output;
		
	}

}