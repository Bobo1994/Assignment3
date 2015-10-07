import javax.swing.JApplet;

import javax.swing.JOptionPane;
/**
 * The program for users to log in
 * Yibing Zhang zhang60638@Gmail.com
 */
public class Extra extends JApplet{
	public enum AccountType{admin,student,staff}
	public void start() {
		AccountType [] choices ={AccountType.admin, AccountType.student,AccountType.staff};
		String username,password, usernameinput, passwordinput;//declare the strings
		String Account= JOptionPane.showInputDialog(null,"Type your account");//prompt for account
		int n=1;
		username="CSC200";//define the username
		password="123123";//define the password
		do{
			usernameinput=JOptionPane.showInputDialog(null,"Enter your username");
			if (usernameinput.equals(username)){	
			do{
				passwordinput=JOptionPane.showInputDialog(null,"Enter your password");//prompt for the username
				if(passwordinput.equals(password)){
				AccountType select=(AccountType) JOptionPane.showInputDialog(null, "Select your account type","AccountType", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);//select account
				String selecta =select.toString();//convert selct to slecta(enum number to string)
				while (!selecta.equals(Account)){
				select=(AccountType) JOptionPane.showInputDialog(null, "Select your account type","AccountType", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);//while !select=/selecta, go back to select accounttype again	
				selecta= select.toString();
				} 
				switch (select){	
				case admin:
				JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read file!");
				return;
				case staff:
				JOptionPane.showMessageDialog(null,"Welcome Staff! You can update, read, add, delete file.");
				return;
				case student:
				JOptionPane.showMessageDialog(null,"Welcome Student! You can only read file.");
				return;//switch cases
				}
				}
			else{n=n+1;}//if the password=/ inputpassword, n++, and then go back to prompt for the password
			}
			while(n<=3);//if n is less than or equal to 3, print "contact admin"
			JOptionPane.showMessageDialog(null, "Your account has been locked, please contact Administrator!");return;
			}else {n=n+1;//if the username=/ inputusername, n++, pint "Invalid username", and then go back to prompt for the usrename
			JOptionPane.showMessageDialog(null, "Invaild username!");
			}
			}while(n<=3);//if n is less than or equal to 3, print "contact admin"
			JOptionPane.showMessageDialog(null, "Your account has been locked, please contact Administrator");
	}

}
