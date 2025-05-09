package ai.abc.beans;

public class PaymentProcessing {

	private IPay cardPayment = null;// field injection

	//constructor injection
	public PaymentProcessing(IPay cardPayment) {
		this.cardPayment = cardPayment;
	}
	//setter injection
	public void setCardPayment(IPay cardPayment)
	{
		this.cardPayment = cardPayment;
	}

	public boolean doPayment(String cardType, Double billAmount) {
		
		return cardPayment.payTheBill(billAmount);
		
//		if ("Credit".equals(cardType)) {
//			CreditCardPayment ccp = new CreditCardPayment();
//			return ccp.payTheBill(billAmount);
//		} else if ("Debit".equals(cardType)) {
//			DebitCardPayment dcp = new DebitCardPayment();
//			return dcp.payTheBill(billAmount);
//		} else if ("Amex".equals(cardType)) {
//			AmexPayment am = new AmexPayment();
//			return am.payTheBill(billAmount);
//		} else {
//
//			return false;
//
//		}
	}
}
