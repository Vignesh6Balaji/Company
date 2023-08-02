package Model;
import java.util.Comparator;
public class PNo implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		int hs=((Long)o1.getpNo()).hashCode();
		int hs2=((Long)o2.getpNo()).hashCode();
		return hs-hs2;
	}

}
