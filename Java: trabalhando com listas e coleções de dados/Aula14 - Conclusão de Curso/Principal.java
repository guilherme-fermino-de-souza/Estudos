
import java.util.Collections;
import java.util.Scanner;
	/*DESAFIO: Compras Realizadas.*/
public class Principal {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the card limit: "); //Credit Card ----------------------------------------------------------------->
		CartaoDeCredito creditCard = new CartaoDeCredito(scan.nextDouble());
		
		int n = 0;
		for(int i = 0; i != 1;) {	
			n++;
			System.out.println("Enter the " + n + "° Item description: ");//Item ----------------------------------------------------------->
			String item = scan.next();
			System.out.println("Enter the " + n + "° item value: ");
			double itemValue = scan.nextDouble();		
			Compra compra = new Compra(item, itemValue);	
			boolean shoppingFinished = creditCard.ShoppingLaunch(compra);
			
			if (shoppingFinished) {
				System.out.println("Purchase Made!");
				System.out.println("Write (C) for Continue or (L) for Leave.");
				String answer = scan.next();
				if (answer.equalsIgnoreCase("C")) {
					System.out.println("\n Continuing... \n.");
				} else if (answer.equalsIgnoreCase("L")) {
					System.out.println("\n Leaving... \n.");
					i = 1;
				} else {
					System.out.println("\n *Invalid String* \n.");
				} 
			} else {
				System.out.println("\n *not enought balance* \n.");
			}
		}
		
		Collections.sort(creditCard.getShoppings());
		System.out.println("****************************");
		System.out.println("COMPRAS REALIZADAS: \n.");
		for (Compra c : creditCard.getShoppings()) {
			System.out.println(c.getDescription() + " - " + c.getValue());
		}
		System.out.println("\n****************************");

		System.out.println("\nCard Balance: " + creditCard.getBalace());
	}
}
