
import java.awt.*;

public class Center {

    static MyImage execute(MyImage input1, MyImage input2, MyImage input0) { 

		int width1 = input1.width;
		int width2 = input2.width;
		int height1 = input1.height;
		int height2 = input2.height;
	
		int width  = width2;
		int height = height2;

		MyImage output = new MyImage(width, height);
		
	
    for(int i = 0; i < height; i++) {
	for(int j = 0; j < width; j++) {
	    boolean isProcessed = false;
	
	    if(height1 < i && width1 < j && j < width1*2) {
		
		Color color0 = input0.getColor(j-width1, i-height1);
			    
		if(color0.getRed() > 0) {
		    Color color1 = input1.getColor(j-width1, i-height1);
		    output.setColor(j, i, color1);			
		    isProcessed = true;
		}
	    }
	    
	    if(i < height2 && j < width2) {
			    if(isProcessed == false) {
				
				Color color2 = input2.getColor(j, i);
				output.setColor(j, i, color2);
			    }
			}
	}
    }
    
    return output;
    
    }
}
    
    
