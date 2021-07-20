package sopvn.crmsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopvn.crmsystem.model.campaignmember;

public interface campaignmemberRepository extends JpaRepository<campaignmember, Integer> {
	
}
