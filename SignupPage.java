import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
public class SignupPage extends Frame implements ActionListener,WindowListener{
	TextField t1 = new TextField(30);
	TextField t2 = new TextField(30);
	TextField t3 = new TextField(30);
	
	Button b1;
	public SignupPage() {
		setTitle("SIGNUP");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		
		Label f1 = new Label("E-mail      ");
		Label f2 = new Label("Username ");
		Label f3 = new Label("Password ");
		
		f1.setAlignment(Label.CENTER);
		f2.setAlignment(Label.CENTER);
		f3.setAlignment(Label.CENTER);
		
		t3.setEchoChar('*');
		
	        b1 = new Button("SUBMIT");
	        b1.addActionListener(this);
	    
		add(f1);
		add(t1);
		add(f2);
		add(t2);
		add(f3);
		add(t3);
		add(b1);
		t1.setText("");
		t2.setText("");
		t3.setText("");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
		
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("E-mail    - "+t1.getText());
		System.out.println("Username  - "+t2.getText());
		System.out.println("Password  - "+t3.getText());
	}
    public static void main(String[] args) {
    	 new SignupPage();
     }
}
