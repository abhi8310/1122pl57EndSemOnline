import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {

	Projects proj=new Projects("project1");
	
	@Before
	public void setUp() throws Exception {
		proj.assign_team();
	}

	@Test
	public void test() {
		assertEquals("project1",proj.get_projectname());
	}
	
	public void tes1() {
		assertEquals("project1",proj.get_projectname());
	}
}
