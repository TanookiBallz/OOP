public class Book {
	// Attributes
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	// Default constructor
	public Book() {
			this.title = "";
			this.author = "";
			this.ISBN = "";
			this.price = 0.0;
	}
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	public void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("ISBN: " + ISBN);
		System.out.println("Price: $" + price);
}

// Additional method: applyDiscount
public void applyDiscount(double discountPercentage) {
		if (discountPercentage > 0 && discountPercentage <= 100) {
				this.price -= this.price * (discountPercentage / 100);
		} else {
				System.out.println("Invalid discount percentage!");
		}
	}
}
