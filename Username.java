import javax.swing.JOptionPane;
/**
 * The program for users to log in
 * Yibing Zhang zhang60638@Gmail.com
 */
public class Username {

	public static void main(String[] args) {
		String username,password, usernameinput, passwordinput;//declare the strings
		int n=1;
		username="CSC200";//define the username
		password="123123";//define the password
		do{
			usernameinput=JOptionPane.showInputDialog(null,"Enter your username");//prompt for the username
			if (usernameinput.equals(username)){	
			do{
				passwordinput=JOptionPane.showInputDialog(null,"Enter your password");//if username= inputusername, prompt for the password
				if(passwordinput.equals(password)){
					JOptionPane.showMessageDialog(null,"Welcome"+ username);return;}//if password=inputpassword, print welcome
			else{n=n+1;}//if the password=/ inputpassword, n++, and then go back to prompt for the password
			}
			while(n<=3);
			JOptionPane.showMessageDialog(null, "Your account has been locked, please contact Administrator!"); return;//if n is less than or equal to 3, print "contact admin"
			}else {n=n+1;//if the username=/ inputusername, n++, pint "Invalid username", and then go back to prompt for the usrename
			JOptionPane.showMessageDialog(null, "Invaild username!");
			}
			}while(n<=3);//if n is less than or equal to 3, print "contact admin"
			JOptionPane.showMessageDialog(null, "Your account has been locked, please contact Administrator!");
		}
}
