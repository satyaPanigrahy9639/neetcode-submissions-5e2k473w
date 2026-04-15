public class Car {
    int position;
    double timeToTarget;

    public Car(int position, double timeToTarget) {
        this.position = position;
        this.timeToTarget = timeToTarget;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    double time[] = new double[position.length];
     Car cars[] = new Car[position.length];

        for (int j = 0; j< cars.length;j++){
            cars[j] = new Car(position[j],(double)(target - position[j])/speed[j]);
        }
        Arrays.sort(cars, Comparator.comparingInt(a -> a.position));
        double maxTime = 0; int fleet = 0;
        for (int k = cars.length-1;k>=0;k--){
            double t = cars[k].timeToTarget;
            if(t>maxTime) {
                fleet++;
                maxTime = t;
            }
        }
        return fleet;
    }
}
