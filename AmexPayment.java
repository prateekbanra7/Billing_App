package ai.abc.beans;

public class AmexPayment implements IPay {

	public boolean payTheBill(Double billAmount) {
		System.out.println("Paying Bill Using ACD" + billAmount);
		return true;
	}
}
