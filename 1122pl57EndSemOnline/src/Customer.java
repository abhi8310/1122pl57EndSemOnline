import java.util.ArrayList;
import java.util.List;


public class Customer implements Emp{
	String type;
	List<String> tasks=new ArrayList<String>();
	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		type="Customer";
	}
}
