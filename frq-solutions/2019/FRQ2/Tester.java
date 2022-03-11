public class Tester{
  public static void main(String[] args){
    StepTracker steptracker1 = new StepTracker(9000);
    steptracker1.addDailySteps(10000);
    steptracker1.addDailySteps(12000);
    System.out.println(steptracker1.averageSteps());
    System.out.println(steptracker1.activeDays());
  }
}
