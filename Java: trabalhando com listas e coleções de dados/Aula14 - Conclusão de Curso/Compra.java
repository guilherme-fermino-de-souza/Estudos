
public class Compra implements Comparable<Compra>{
	private String description;
	private double value;
	
	public Compra(String description, double value) {
		this.description = description;
		this.value = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Double getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return "Shopping { " +
				"Description: " + description + '\'' +
				", Value: " + value +
				'}';
	}

	@Override
	public int compareTo(Compra outraCompra) {
		// TODO Auto-generated method stub
		return Double.valueOf(getValue()).compareTo(Double.valueOf(outraCompra.getValue()));
	}
}
