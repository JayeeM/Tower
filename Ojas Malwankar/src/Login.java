import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	JTextField field;
	JPasswordField password;
	JLabel status;
	public static void main(String[] args) {
		new Login();
	}
	
	public Login() {
		super("Login into your account");
		setSize(400, 200);
		setLayout(new FlowLayout() );
		
		field = new JTextField(40);
		add(field);
		password = new JPasswordField(30);
		add(password);
		
		JButton button = new JButton("login");
		button.addActionListener(this);
		add(button);
		setVisible(true);
		
		status = new JLabel("");
		add(status);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Got an event");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (field.getText().equals("keshavio") && password.getText().equals("chicken")){
			System.out.println("Login successful");
		}
		else{
			System.out.println("Invalid username or password");
		}
	}
}
