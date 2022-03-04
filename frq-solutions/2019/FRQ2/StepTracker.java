public class StepTracker
{
private int minSteps;
private int totalSteps;
private int days;
private int activedays;

public StepTracker(int minSteps){
  this.minSteps = minSteps;
  this.totalSteps = 0;
  this.days = 0;
  this.activedays = 0;
}

public void addDailySteps(int steps){
  totalSteps += steps;
  days++;
  if (steps >= minSteps){
    activedays++;
  }
}

public int activeDays(){
  return activedays;
}

public double averageSteps(){
  if (days == 0){
    return 0.0;
  }
  else{
    double total = this.totalSteps / this.days;
    return total;
  }
}



}
