package Model;
import java.util.Comparator;
public class FName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getfName().compareToIgnoreCase(o2.getfName());
	}
}
