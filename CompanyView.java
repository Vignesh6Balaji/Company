package View;
import java.util.Scanner;
import Control.CompanyControl;
public class CompanyView {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CompanyControl cc=new CompanyControl();
		System.out.println("Welcome to TVA");
		boolean b=true;
		char c='y';
		while(b||c=='y'||c=='Y') {
			System.out.println("Enter 1 for add employee");
			System.out.println("Enter 2 for remove employee");
			System.out.println("Enter 3 for edit employee");
			System.out.println("Enter 4 for view employees");
			System.out.println("Enter your choice :");
			int ch=s.nextInt();
			switch(ch) {
			case 1:cc.addEmp();
			break;
			case 2:cc.removeEmp();
			break;
			case 3:cc.editEmp();
			break;
			case 4:cc.sortEmp();
			break;
			default :System.out.println("Invalid Choice!!!");
			}
			b=false;
			System.out.println("Do you want to continue?");
			System.out.println("If yes type y or no type n");
			c=s.next().charAt(0);
		}
		System.out.println("Thank you for using our application");
	}

}
