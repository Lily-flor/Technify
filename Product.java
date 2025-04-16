public class Product {
  //fields
  protected String name;
  protected double price;

  //constructors
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  //instance methods
  //getters
  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  //setters
  public void setName(String newName) {
    this.name = newName;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }
}
