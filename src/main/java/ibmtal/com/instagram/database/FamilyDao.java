package ibmtal.com.instagram.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.com.instagram.entity.Family;

public interface FamilyDao extends JpaRepository<Family, Integer> {

}
