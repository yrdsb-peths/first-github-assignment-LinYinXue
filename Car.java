public class Car
{
  private String company;
  private String color;
  private int year;
  
  public Car(String company, String color, int year)
  {
     this.company = company;
     this.color = color;
     this.year = year;
  }

  public String toString()
  {
    return "Company: " + company + ", Color: " + color + ", Year: " + year;
  }
}
