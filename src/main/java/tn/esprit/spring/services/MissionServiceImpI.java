package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.MissionRepository;

public class MissionServiceImpI implements IMissionService {
	
	@Autowired
	 MissionRepository missionRepository;
	
	
	private static final Logger l = LogManager.getLogger(IMissionService.class);


	


	@Override
	public List<Mission> retrieveAllMission() {
		l.info("Retreiving user object");
		List<Mission> mission = null; 
		try {
	
			l.info("In retrieveAllContrats() : ");
			 mission = (List<Mission>) missionRepository.findAll();  
			for (Mission m :  mission) {
				l.debug("contrats +++ : " + mission);
			} 
			l.info("Out of retrieveAllmission() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllmission() : " + e);
		}

		return  mission;
	}


	@Override
	public  Mission addMission(Mission M) {
		// TODO Auto-generated method stub
		return missionRepository.save(M); 
	}


	@Override
	public void deleteMission(int id) {
		 missionRepository.delete( missionRepository.findById(id).get());	
		
	}




	@Override
	public Mission retrieveMissiont(int id) {
		// TODO Auto-generated method stub
		return missionRepository.findById(id).get();	
	}
	
	
	
}
