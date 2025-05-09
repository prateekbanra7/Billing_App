package ai.abc.main;

import ai.abc.beans.*;
import ai.abc.beans.PaymentProcessing;

public class Main {

	public static void main(String[] args) {
		
//constructor injection
		PaymentProcessing pp = new PaymentProcessing(new CreditCardPayment());
		
//dependency injection-->Injecting dependent object into target object		
		
//setter injection
//injecting dependent object into the target object using target class setter-->setter injection
		pp.setCardPayment(new DebitCardPayment());
		
		boolean status = pp.doPayment("Debit", 100.0);
		
		if (status) {
			System.out.println("Payment success!!");
		}
		else
		{
			System.out.println("Failed payment");
		}
		
		//creating target class object and dependent class object
		//injecting dependent object into target class is not just one project requirement
		//it is universal requirement in project
		
		//IOC -->principle--> responsible--> manage and collaborate
		//-- dependencies among the objects in the application

	}

}
