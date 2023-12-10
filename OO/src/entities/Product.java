package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) { //usado o void já que não vai retornar nada, só modificar.
		this.quantity += quantity; //this.quantity acessa a variável principal, enquanto o quantity vem da função
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { //Deixar no formato de texto
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
	
}
