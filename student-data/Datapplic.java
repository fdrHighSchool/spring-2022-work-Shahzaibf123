import java.util.*;
public class Datapplic {
  public static void main(String args[]) {
    //store data
    int[] id = {1234567,9876543,1357911,2468101, 1928374};
    String[] name = {"Jimmy Smith", "Mara Hernandez", "Jamal Jenkins", "Rana Ah", "Michael Go"};
    Boolean[] cc = {true,false,false,true,true};
    String[] grades = {"90,80,95,90,100", "95,100,100,90,90","85,85,95,100,90","90,100,95,85,90","80,80,65,55,90"};

      int[] grades1 = {90,80,95,90,100};
      Student student1 = new Student("1234567","Jimmy Smith", true, grades1);
      Student student2 = new Student("98764543","Maria Hernandez",false, new int[] {95,100,100,90,90});
      System.out.println(student1.getName() + "'s average is: " + student1.getAverage());
      if (student1.isFailing()) {
        System.out.println("You're failing! Work harder! :(");
      }
      else {
        System.out.println("You're passing all your classes! Congrats! :)");
      }
      if (student1.getCloseContact()){
        System.out.println("Please report to the auditorium for your take-home covid test.");
      }
      else {
        System.out.println("You are not a close contact, keep masking! Get boosted.");
      }

      //********** Student 2:


      System.out.println(student2.getName() + "'s average is: " + student2.getAverage());
      if (student2.isFailing()) {
        System.out.println("");
        System.out.println("You're failing! Work harder! :(");
      }
      else {
        System.out.println("You're passing all your classes! Congrats! :)");
      }
      if (student2.getCloseContact()){
        System.out.println("Please report to the auditorium for your take-home covid test.");
      }
      else {
        System.out.println("You are not a close contact, keep masking! Get boosted.");
      }

  }
}
