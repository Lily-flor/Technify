public class Store {
  //fields
  protected String name;
  protected String owner;
  protected String location;

  //constructor
  public Store(String name, String owner, String location) {
    this.name = name;
    this.owner = owner;
    this.location = location;
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
