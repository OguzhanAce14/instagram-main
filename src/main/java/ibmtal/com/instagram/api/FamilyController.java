package ibmtal.com.instagram.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.instagram.business.services.FamilyService;
import ibmtal.com.instagram.entity.Family;

@RestController
@RequestMapping("/api/family")
	public class FamilyController {
	private FamilyService familyService;
	@Autowired
	public FamilyController(FamilyService familyService) {
	    super();
	    this.familyService = familyService;
	}
		
	@GetMapping("/getall")
	public ArrayList<Family> hepsi(){
			return new ArrayList<Family>();
						
	}
		
}


