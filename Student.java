public class Student
{
  public String firstName;
  public int gradeLevel;
  
  public Student(String name, int grade)
  {
     firstName =name;
     gradeLevel = grade;
  }

  public String toString()
  {
    return firstName + "" + gradeLevel;
}
