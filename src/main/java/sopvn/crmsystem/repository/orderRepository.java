package sopvn.crmsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopvn.crmsystem.model.order;

public interface orderRepository extends JpaRepository<order, Integer> {
	
}