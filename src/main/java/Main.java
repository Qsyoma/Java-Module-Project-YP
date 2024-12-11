import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // третья попытка
        Race rc = new Race();
        ArrayList<Car> carList = new ArrayList<>();
        Scanner speedScan = new Scanner(System.in);
        Scanner namesScan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите имя машины номер " + i);
            String model = namesScan.nextLine();
            int kmh;
            while (true) {
                System.out.println("Введите скорость машины номер " + i);
                kmh = speedScan.nextInt();
                if (kmh <= 0 || kmh > 250) {
                    System.out.println("Неверная скорость");
                } else {
                    break;
                }


            }
            carList.add(new Car(kmh, model));
        }
        for (Car car : carList) {
            rc.winRace(car.speed, car.name);
        }
        System.out.println("Самая быстрая машина: " + rc.winner);
    }
}
       /* вторая попытка
       Car cars = new Car("",0);
        Race race = new Race();
        Scanner Nscan = new Scanner(System.in);
        Scanner Sscan = new Scanner(System.in);

for (int i = 1; i<4; i++){
    System.out.println("Введите имя машины номер "+ i );
    String nameCar = Nscan.nextLine();
    int speedCar;
    while (true) {
        System.out.println("Введите скорость машины номер " + i);
        speedCar = Sscan.nextInt();

        if (speedCar <= 0 || speedCar > 250) {
            System.out.println("Неверная скорость");
        } else {
            break;
        }

    }  race.win(speedCar,nameCar);

}
        System.out.println("Самая быстрая машина: " + race.winner);

    }
}*/
      /* первая попытка

       Car frstCar = new Car();
        Car scndCar = new Car();
        Car thrdCar = new Car();
        System.out.println("Имя первой машины");
        frstCar.setModel();
        System.out.println("Скорость первой машины");
        frstCar.setSpeed();
        System.out.println("Имя второй машины");
        scndCar.setModel();
        System.out.println("Скорость второй машины");
       scndCar.setSpeed();
        System.out.println("Имя третьей машины");
        thrdCar.setModel();
        System.out.println("Скорость третьей машины");
       thrdCar.setSpeed();
Race race = new Race();
race.win(frstCar.getSpeed(), scndCar.getSpeed(), thrdCar.getSpeed(), frstCar.getModel(), scndCar.getModel(), thrdCar.getModel());


    }
}*/