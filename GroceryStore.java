public class GroceryStore extends Store {
  protected ArrayList<Product> foods;

  public GroceryStore(String name, String owner, String location) {
    super(name, owner, location);
    foods = new ArrayList<Product> ();
  }

  public void addFood(Product p) {
    foods.add(p);
  }
}
