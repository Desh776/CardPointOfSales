package CardSalesPoint.PointOfSales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CardSalesPoint.PointOfSales.exception.UserNotFoundByException;
import CardSalesPoint.PointOfSales.model.Card;
import CardSalesPoint.PointOfSales.repo.CardRepo;

@Service
public class CardService {
	
	public final CardRepo crdRepo;
	
	@Autowired
	public CardService(CardRepo crdRepo) {
		this.crdRepo = crdRepo;
	}
	
	public Card addCard(Card card) {
		
		return crdRepo.save(card);
	}
	
	public List<Card> findAllCards()
	{
		return crdRepo.findAll();
	}
	
	public Card updateCard(Card card)
	{
		return crdRepo.save(card);
	}
	
	public Card findCardById(int id) {
		return crdRepo.findCardById(id).orElseThrow(() -> new UserNotFoundByException("User by id " + id + " was not found "));
	}
	
	public void deleteCard(int id) {
		crdRepo.deleteCardById(id);
	}

}
