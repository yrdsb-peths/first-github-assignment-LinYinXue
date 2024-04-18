public class Fraction
{
  private int Num;
  private int Den;
  
  public Fraction(int numerator, int denominator)
  {
     if(denominator ==0)
     {
        System.out.println("denominator can't be 0");
        return;
     }
     Num = numerator;
     Den = denominator;
  }

  public String toString()
  {
    return Num + "/" + Den;
  }
}
