package Model;
import java.util.ArrayList;
public class Company {
	public static String company="TVA";
	public static String address="Kang Dynasity";
	public static Long phNo=9988776655l;
	public static int pincode=666666;
	
	@Override
	public String toString() {
		return "Company :"+company+"Address :"+address+"Phone number :"+phNo+"PinCode :"+pincode;
	}
	
	public ArrayList<Employee> employee=new ArrayList<>();
}
