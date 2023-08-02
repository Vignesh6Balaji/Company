package Model;

public class EmpNotFoundExcep extends RuntimeException{
	@Override
	public String getMessage() {
		return "Employee not found";
	}
}
