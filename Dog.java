public class Dog
{
  public String dogName;
  public String dogBreed;
  
  public Dog(String name, String breed)
  {
     dogName =name;
     dogBreed = breed;
  }

  public String toString()
  {
    return "Dog's name: " + dogName + "\nBreed: " + dogBreed;
}