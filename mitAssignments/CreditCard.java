package mitAssignments;

public class CreditCard {
	private String cardNumber;
	private double expenses;
	
	public void charge(double amount) {
		expenses = expenses + amount;
	}
	public String getCardNumber(String password) {
		if(password.equals("SECRET!3*!")) {
			return cardNumber;
		}
		return "jerkface";
	}
	public String getcardNumber() {
		return cardNumber;
	}
	public double getExpenses() {
		return expenses;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	public void setcardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String toString() {
		return cardNumber + " " + expenses;
		
	}

}
