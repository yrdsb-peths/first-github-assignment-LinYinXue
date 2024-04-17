public class Pizza
{
  private String type;
  private String topping;
  private int size;
  private double price;
  
  public Pizza(String theType, String theTopping, int theSize, double thePrice)
  {
     type = theType;
     topping = theTopping;
     size = theSize;
     price = thePrice;
  }

  public String toString()
  {
    return "Type: " + type + "\nTopping: " + topping + "\nSize: " + size+ "\nPrice:" + price;
}
