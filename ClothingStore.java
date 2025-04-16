public class ClothingStore extends Store{
  private int size;
  private String brand;


  public ClothingStore(String name,String owner,int size,String brand){
    super(name,owner);
    this.size = size;
    this.brand = brand;
  }
  public int getSize(){
    return size;
  }
  public String getBrand(){
    return brand;
  }  
  public void setSize(int newSize){
    this.size = newSize;
  }
  public void setBrand(String newBrand){
  this.brand = newBrand;
  }
}
