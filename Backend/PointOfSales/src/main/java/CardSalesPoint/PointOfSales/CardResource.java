package CardSalesPoint.PointOfSales;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CardSalesPoint.PointOfSales.model.Card;
import CardSalesPoint.PointOfSales.service.CardService;

@RestController
@RequestMapping("/card")
public class CardResource {
	//	http://localhost:8080/card/all
	private final CardService crdService;
	
	public CardResource(CardService crdService) {
		this.crdService = crdService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Card>> getAllCards () {
		List<Card> cards = crdService.findAllCards();
		return new ResponseEntity<>(cards, HttpStatus.OK);
	}
	
	@GetMapping("find/{id}")
	public ResponseEntity<Card> getCardById (@PathVariable("id") int id) {
		Card cards = crdService.findCardById(id);
		return new ResponseEntity<>(cards, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Card> addCard(@RequestBody Card card) {
		Card newCard = crdService.addCard(card);
		return new ResponseEntity<>(newCard, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Card> updateCard(@RequestBody Card card) {
		Card updatedCard = crdService.updateCard(card);
		return new ResponseEntity<>(updatedCard, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Card> removeCard(@PathVariable("id") int id) {
		crdService.deleteCard(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
