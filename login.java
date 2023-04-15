import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class login extends Applet 
{
Label title = new Label("Login Page"); 
Label username = new Label("Username"); 
Label password = new Label("Password"); 
TextField tusername = new TextField(20); 
TextField tpassword = new TextField(10); 
Button loginn = new Button("Login"); 
Button reset = new Button("Reset");  
TextField er = new TextField(); 
public void init() { 
setSize(500,500); setLayout(null); 
//Setting Bounds 
title.setBounds(150, 50, 200, 100); 
username.setBounds(20, 150, 150, 100); 
password.setBounds(20, 240, 150, 100); 
tusername.setBounds(180, 180, 250, 40); 
tpassword.setBounds(180, 270, 250, 40); 
loginn.setBounds(100, 350, 100, 40); 
reset.setBounds(250, 350, 100, 40); er.setBounds(180, 
400, 250, 40); 
//Setting Fonts 
title.setFont(new Font("Lucida",Font.PLAIN,34)); 
username.setFont(new Font("Lucida",Font.PLAIN,24)); 
tusername.setFont(new Font("Lucida",Font.PLAIN,24)); 
username.setFont(new Font("Lucida",Font.PLAIN,24)); 
tpassword.setFont(new Font("Lucida",Font.PLAIN,24)); 
tpassword.setEchoChar('*'); add(username); 
add(title);  
add(password); 
add(tusername); 
add(tpassword); 
add(loginn); 
add(reset); 
add(er); 
setVisible(true); 
}
}


