package sopvn.crmsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopvn.crmsystem.model.campaign;

public interface campaignRepository extends JpaRepository<campaign, Integer> {
	
}
