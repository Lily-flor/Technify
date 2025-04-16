import java.util.ArrayList;

public class Store {
  //fields
  protected String name;
  protected String owner;
  protected String location;
  protected ArrayList<Product> products;

  //constructor
  public Store(String name, String owner) {
    this.name = name;
    this.owner = owner;
    products = new ArrayList<Product>();
  }
  //instance methods
  //basic setters
  public void setName(String newName) {
    this.name = newName;
  }

  public void setOwner(String newOwner) {
    this.owner = newOwner;
  }

  public void setLocation(String newLocation) {
    this.location = newLocation;
  }

  public void addProduct(Product p) {
    products.add(p)
  }

  //basic getters
  public String getName() {
    return name;
  }

  public String getOwner() {
    return owner;
  }

  public String getLocation() {
    return location;
  }
}
