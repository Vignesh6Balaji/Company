package Control;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import Model.Company;
import Model.Email;
import Model.EmpNotFoundExcep;
import Model.Employee;
import Model.FName;
import Model.PNo;
public class CompanyControl {
	Company company=new Company();
	Scanner s=new Scanner(System.in);
	
	public void addEmp() {
		System.out.println("Enter the EmpID :");
		int id=s.nextInt();
		System.out.println("Enter the First Name :");
		String fName=s.next();
		System.out.println("Enter the Last Name :");
		String lName=s.next();
		System.out.println("Enter the Phone Number :");
		Long pNo=s.nextLong();
		System.out.println("Enter the EmailID :");
		String emailID=s.next();
		System.out.println("Enter the Password :");
		String pwd=s.next();
		
		Employee e=new Employee(id,fName,lName,pNo,emailID,pwd);
		company.employee.add(e);
		System.out.println("Employee details added to company successfully");
	}
	
	public void removeEmp() {
		System.out.println("Enter the EmpID to remove employee :");
		int id=s.nextInt();
		boolean found=false;
		for(int i=0;i<company.employee.size();i++) {
			Employee e=company.employee.get(i);
			if(id==e.getEid()) {
				company.employee.remove(i);
				System.out.println("Employee details removed from company successfully");
				found=true;
				break;
			}
		}
		
		if(found==false) {
			throw new EmpNotFoundExcep();
		}
	}
	
	public void sortEmp() {
		System.out.println("In which format do you want to display?");
		System.out.println("Enter 1 for sort based on First Name");
		System.out.println("Enter 2 for sort based on Email ID");
		System.out.println("Enter 3 for sort based on Phone number");
		System.out.println("Enter your choice :");
		int c=s.nextInt();
		Comparator d=null;
		switch(c) {
		case 1:d=new FName();
		break;
		case 2:d=new Email();
		break;
		case 3:d=new PNo();
		break;
		default :System.out.println("Invalid choice");
		}
		Collections.sort(company.employee,d);
		System.out.println(company.employee);
	}
	
	public void editEmp() {
		System.out.println("On what basis do you want to edit?");
		System.out.println("Enter 1 for edit First Name");
		System.out.println("Enter 2 for edit Email ID");
		System.out.println("Enter 3 for edit phone number");
		System.out.println("Enter 4 for edit password");
		System.out.println("Enter your choice :");
		int c=s.nextInt();
		System.out.println("Enter the Employee ID :");
		int id=s.nextInt();
		switch(c) {
		case 1:{
			System.out.println("Enter new name which you want to edit :");
			String FName=s.next();
			for(Employee e1:company.employee) {
				if(id==e1.getEid())
					e1.setfName(FName);
			}
			System.out.println("Your name edited successfully");
		}
		break;
		case 2:{
			System.out.println("Enter the email which you want to edit :");
			String email=s.next();
			for(Employee e1:company.employee) {
				if(id==e1.getEid())
					e1.setEmail(email);
			}
			System.out.println("Your email edited successfully");
		}
		break;
		case 3:{
			System.out.println("Enter the phone number which you want to edit :");
			Long phno=s.nextLong();
			for(Employee e1:company.employee) {
				if(id==e1.getEid())
					e1.setpNo(phno);
			}
			System.out.println("Your phone number edited successfully");
		}
		break;
		case 4:{
			System.out.println("Enter the password which you want to edit :");
			String pwd=s.next();
			for(Employee e1:company.employee) {
				if(id==e1.getEid())
					e1.setPwd(pwd);
			}
			System.out.println("Your password edited successfully");
		}
		break;
		default:throw new EmpNotFoundExcep();
		}
	}
}
