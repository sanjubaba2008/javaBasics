package mitAssignments;

public class Malicious {
	public static void main(String [] args) {
		CreditCard card = new CreditCard();
		card.setExpenses(10);
		maliciousMethod(new CreditCard());
		maliciousMethod(card);
		card.setcardNumber("123456789");
		System.out.println(card.getExpenses());
		card.setExpenses(100);
		System.out.println(card.getExpenses());
		maliciousMethod(card);
		System.out.println(card.getExpenses());
		CreditCard card1 = new CreditCard();
		card1.setcardNumber("4888 2314 7515 8412");
		System.out.println(card1.getCardNumber("hello"));
		
		maliciousMethod(card1);
		Hello[] hello = new Hello[4];
		
		for(Hello h:hello) {
			System.out.println(h);
		}
		
	}
	static void maliciousMethod(CreditCard card) {
		card.setExpenses(0);
		System.out.println(card.getcardNumber());
	}

}
