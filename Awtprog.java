import javax.swing.*;
import java.awt.*;
public class Awtprog
{
	public static void main(String args[])
	{
		
		JFrame jf = new JFrame();
		JButton jb = new JButton(" click ");
		jf.add(jb);
		jb.setBounds(80,30,120,40);
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(0);
		jf.setVisible(true);
	}
}

	
