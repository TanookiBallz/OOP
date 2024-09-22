public class App {
    public static void main(String[] args) throws Exception {
          // Creating objects using default constructor
					Book book1 = new Book();
					book1.displayInfo();  // Should display default values
					
					// Creating objects using parameterized constructor
					Book book2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 45.0);
					book2.displayInfo();
					
					// Testing the additional method: applyDiscount
					book2.applyDiscount(10);  // Applying 10% discount
					book2.displayInfo();  // Should show the updated price with discount
					
					// Another object using parameterized constructor
					Book book3 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 40.0);
					book3.displayInfo();
    }
}
