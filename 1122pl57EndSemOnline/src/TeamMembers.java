import java.util.List;
import java.util.ArrayList;


public class TeamMembers implements Emp{
	String type;
	List<String> tasks=new ArrayList<String>();
	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		type="TeamMembers";
	}

}
