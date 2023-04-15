import java.awt.*;
import javax.swing.*;
class First extends JFrame
{ 
	public static void main(String args[])
	{
	
	 
		Button b=new Button("click me"); 
		b.setBounds(30,100,80,30);// setting button position 
		First.add(b);//adding button into frame 
		First.setSize(300,300);//frame size 300 width and 300 height 
                First.setLayout(null);//no layout manager 
                First.setVisible(true);//now frame will be visible, by default not visible 
	   
		   
		   
		   }
		    
	
}




