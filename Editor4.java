import java.awt.Color;

public class Editor4 {
    public static void main (String[] args) {
        
        
        String input = args[0];
		
        
		
        Color[][] picture = Runigram.read(input);
		
       int x = Integer.parseInt(args[1]);
        Runigram.setCanvas(picture);
		
        Runigram.morph(picture, Runigram.grayScaled(picture), x);
   
   
   
   
   
   
   
   
   
   
   }}
