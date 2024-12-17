public class Student
{
  private int ID;
  private int grade;
  private String name;

  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    id = input_id;
    grade = input_grade;
    name = input_name;
  }

  public void setID(input_id)
  {
    this.ID = input_id;
  }
  public void setGrade(input_grade)
  {
    this.grade = input_grade;
  }
  public void setName(input_name)
  {
    this.name = input_name;
  }

  public int getID()
  {
    return ID;
  }
  public int getGrade()
  {
    return grade;
  }
  public String getName()
  {
    return name;
  }

  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }
}
