public class Car {
    // третья попытка
    int speed;
    String name;
    public Car(int speed,String name){
        this.speed = speed;
        this.name = name;
    }
}
   /*  вторая попытка
   int speed;
    String model;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

}*/
 /* первая попытка
  private int speed;
 private  String model;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        Scanner scan = new Scanner(System.in);
        int speed = scan.nextInt();
        if (speed < 0 || speed >=250){
            System.out.println("Введите верное значение скорости");
setSpeed();
        }
        else {
            this.speed = speed;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        if (model.isEmpty()){
            System.out.println("Введите корректное имя");
            setModel();
        }
        this.model = model;
    }
}
*/