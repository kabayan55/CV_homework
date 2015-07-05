
import java.awt.*;

public class Heart {

	static MyImage execute(MyImage input1, MyImage input2, MyImage input0) { 

	    int width1 = input1.width;
	    int width2 = input2.width;
	    int height1 = input1.height;
	    int height2 = input2.height;
	    
	    int width  = width1;
	    int height = height1;
	    
	    MyImage output = new MyImage(width, height);
	    
	    for(int i = 0; i < height; i++) {
		for(int j = 0; j < width; j++) {
		    boolean isProcessed = false;
		    
		    if(i< height1 && j < width1) {
			
			Color color0 = input0.getColor(j, i);
			
			if(color0.getRed() > 10) {
			    Color color1 = input2.getColor(j, i);
			    output.setColor(j, i, color1);			
			    isProcessed = true;
			}
		    }
		    
			if(i < height2 && j < width2) {
			    if(isProcessed == false) {
				
				Color color2 = input1.getColor(j, i);
				output.setColor(j, i, color2);
			    }
			}
			else{break;}
		}
	    }
	    
	    return output;
	    
	}
    
}