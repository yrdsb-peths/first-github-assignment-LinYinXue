public class Student
{
  private String firstName;
  private int gradeLevel;
  
  public Student(String name, int grade)
  {
     firstName =name;
     gradeLevel = grade;
  }

  public String toString()
  {
    return firstName + "" + gradeLevel;
}
