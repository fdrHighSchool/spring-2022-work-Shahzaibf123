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
      Student student3 = new Student("1357911","Jamal Jenkins",false, new int[] {85,85,95,100,90});
      Student student4 = new Student("2468101","Rana Ah", true, new int[] {90,100,95,85,90});
      Student student5 = new Student("1928374","Michael Go", true,new int[] {80,80,65,55,90});



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
      //

      student2.setCloseContact(true);
      System.out.println(student2.getCloseContact());

      if (student1.getCloseContact()) {
        System.out.println("Jimmy Smith is a close-contact.");
      }
      else{
        System.out.println("Jimmy Smith is not a close-contact.");
      }
      if (student2.getCloseContact()) {
        System.out.println("Mara Hernandez is a close-contact.");
      }
      else{
        System.out.println("Mara Hernandez is not a close-contact.");
      }
      if (student3.getCloseContact()) {
        System.out.println("Jamal Jenkins is a close-contact.");
      }
      else{
        System.out.println("Jamal Jenkins is not a close-contact.");
      }
      if (student4.getCloseContact()) {
        System.out.println("Rana Ah is a close-contact.");
      }
      else{
        System.out.println("Rana Ah is not a close-contact.");
      }
      if (student5.getCloseContact()) {
        System.out.println("Michael Go is a close-contact.");
      }
      else{
        System.out.println("Michael Go is not a close-contact.");
      }
  }
}
