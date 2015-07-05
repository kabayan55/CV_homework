
import java.awt.*;

public class East1 {

    static MyImage execute(MyImage input1, MyImage input0) { 

		int width1 = input1.width;
		int height1 = input1.height;
	
		MyImage output = new MyImage(width1, height1);
		
	
    for(int i = 0; i < height1; i++) {
	for(int j = 0; j < width1; j++) {
	    boolean isProcessed = false;
	
		Color color0 = input0.getColor(j, i);
			    
		if(color0.getRed() > 0) {
		    Color color1 = Color.white;
		    output.setColor(j, i, color1);			
		    isProcessed = true;
		}
		
	}
    }
    
    return output;
    
    }
}