package ibmtal.com.instagram.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.instagram.business.services.FamilyService;
import ibmtal.com.instagram.database.FamilyDao;
import ibmtal.com.instagram.entity.Family;
@Service
public class FamilyManager implements FamilyService {
	private FamilyDao FamilyDao;
	@Autowired
	public FamilyManager(FamilyDao FamilyDao) {
		super();
		this.FamilyDao = FamilyDao;
	}
	public ArrayList<Family> getAll() {
		
		return new ArrayList<Family>(FamilyDao.findAll());
	}	

}




