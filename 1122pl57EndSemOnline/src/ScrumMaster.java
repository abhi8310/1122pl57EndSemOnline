import java.util.ArrayList;
import java.util.List;


public class ScrumMaster implements Emp{
	String type;
	List<String> tasks=new ArrayList<String>();
	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		type="ScrumMaster";
	}

}
