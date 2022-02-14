public class Student {
// fields, instance variables (data)
  private String id;
  private String name;
  private boolean closeContact;
  private int[] grades;

  //constructor method
  public Student(String id, String n, Boolean cc, int[] g) {
    this.id = id;
    this.name = n;
    this.closeContact = cc;
    this.grades = g;
  }


  //behaviors (methods)

  public double getAverage() {
    int total = 0;
    for (int grade : grades) {
      total += grade;
    }
    return total / grades.length;
  }



  //get closecontact status of student
  public boolean getCloseContact() {
    return this.closeContact;
  }

  //set the value of close contact
  public void setCloseContact(boolean value) {
    closeContact = value;
  }

  //get the String value of the object
  public String getName() {
    return this.name;
  }

  //see if the student is failing
  public boolean isFailing() {
    for (int grade : grades) {
      if (grade < 65) {
        return true;
      }
    }
    return false;
  }

}
