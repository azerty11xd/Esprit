import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;


import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.IMissionService;

public class MisssionsErviceImpItest {
	
	
	@Autowired
	IMissionService m; 

	
	@Test
	@Order(1)
	public void testRetrieveAllMission() {
		List<Mission> missions = m.retrieveAllMission(); 
		// if there are 0 users in DB : 
		Assert.assertEquals(0,missions.size());
	
		
	}
	
	
	
 

}
