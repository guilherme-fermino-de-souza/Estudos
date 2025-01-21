import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
	private double limit;
	private double balance;
	private List<Compra> shoppings;
	
	public List<Compra> getShoppings() {
		return shoppings;
	}

	public void setShoppings(List<Compra> shoppings) {
		this.shoppings = shoppings;
	}

	public CartaoDeCredito(double limit) {
		this.limit = limit;
		this.balance = limit;
		this.shoppings = new ArrayList<>();
	}
	
	public double getLimit() {
		return this.limit;
	}
	
	public double getBalace() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean ShoppingLaunch(Compra shopping) {
		if(this.balance > shopping.getValue()) {
			this.balance -= shopping.getValue();
			this.shoppings.add(shopping);
			return true;
		} else {
			return false;
		}
	}
}
