package CardSalesPoint.PointOfSales.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import CardSalesPoint.PointOfSales.model.Card;
import jakarta.transaction.Transactional;

public interface CardRepo extends JpaRepository<Card, Integer> {
	
	@Transactional
	void deleteCardById(int id);
	
	Optional<Card> findCardById(int id);

}
