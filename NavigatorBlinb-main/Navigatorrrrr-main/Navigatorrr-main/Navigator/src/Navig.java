import java.util.Random;

public class Navig implements Runnable {

    int speed;
    int ostDistance;
    int distance;
    int time;

    int min = 50;
    int max = 101;

    public Navig(int distance){

        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }


    @Override
    public void run() {

        int speedSum = 0;
        int alltime = 0;
        int avSpeed = min;
        while (distance > 0 ){

            speed = new Random().nextInt(max - min) + min;


            speedSum += speed;
            alltime++;
            time = distance/speed;
            avSpeed = (avSpeed+speed)/2;
            ostDistance = distance/avSpeed;
            distance = distance-speed;

            System.out.println("Текущая скорость: " + speed + " м/с");
            System.out.println("Средняя скорость: " + avSpeed + " м/с");
            System.out.println("Дистанция до прибытия: "+ distance + " м");
            System.out.println("Время до прибытия приблизительно: "+ ostDistance + " с");
            System.out.println();


            try {
            Thread.sleep(1000);
            }catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }
}
