public class Student
{
  public String firstName;
  public int gradeLevel;
  
  public Student(String name, String grade)
  {
     firstName =name;
     gradeLevel = grade;
  }

  public String toString()
  {
    return firstName + "" + gradeLevel;
}