package sopvn.crmsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopvn.crmsystem.model.quote;

public interface quoteRepository extends JpaRepository<quote, Integer> {
	
}
