import java.util.Scanner;

public class Main
{

  public static void createDog(Dog inDog, String breed, String name, String color, String )
  {
    inDog.setBreed(breed);
    inDog.setName(name);
    inDog.setColor(color);
    inDog.setWeight(weight);

    Student student1 = Student(123456, 9, "Kianna")
    student1.setGrade(10);




















  }

  public static void main(String[] args)
  {
    // Uncomment and complete the code below to test your Plane class
    Scanner sc = new Scanner(System.in);
    String input = "";
    Plane p = new Plane(1000);
    while (!input.equals("q"))
    {
      System.out.println(p);
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      // System.out.println(print the plane's location and uncomment);
      input = sc.nextLine();

      if (input.equals("u"))
      {
        // move the plane upwards
      }
      else if (input.equals("d"))
      {
        // move the plane downwards
      }
      else if (input.equals("n"))
      {
        System.out.println("Starting location for a new plane?");
        int location = sc.nextInt();
        sc.nextLine(); // consume the ENTER key left behind by nextInt()
        p = // create new plane at proper location
      }
      else if (input.equals("q"))
      {
        System.out.println("Thank you for using plane simulator");
      }
      else
      {
        System.out.println("Invalid input");
      }
    }
  }
}
