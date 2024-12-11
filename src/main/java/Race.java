public class Race {
    // третья попытка
    int distance;
    String winner;

    public void winRace(int speed, String name) {
        int dist = speed * 24;
        if (dist >= distance) {
            distance = dist;
            winner = name;

        }
    }
}
  /* вторая попытка
    String winner;
    int distance;

    public void win (int speed, String name){
        int dist = speed * 24;
        if (dist >= distance){
            distance = dist;
            winner = name;
        }

    }
}*/
  /* первая попытка
   public void win(int speed1, int speed2, int speed3, String name1, String name2, String name3) {
        int km1 = speed1 * 24;
        int km2= speed2 * 24;
        int km3 = speed3 * 24;
        if (speed1 > speed2 && speed1 > speed3) {
            System.out.println("самая быстрая машина: " + name1 + " всего проехала km: " + km1);
        } else if (speed2 > speed1 && speed2 > speed3) {
            System.out.println("самая быстрая машина: " + name2 + " всего проехала km: " + km2);
        } else if (speed3 > speed1 && speed3 > speed2) {
            System.out.println("самая быстрая машина: " + name3 + " всего проехала km: " + km3);
        }
            else if (speed3 == speed2 &&  speed2 == speed1){
            System.out.println("У нас абсолютная ничья!");
        }
            else if (speed3 == speed2 && speed2 > speed1) {
            System.out.println("побеждают срузу две машины: " + name2 + " и " + name3);

        }
        else if (speed3 == speed1 && speed1 > speed2) {
            System.out.println("побеждают срузу две машины: " + name1 + " и " + name3);

        }
        else if (speed2 == speed1 && speed2 > speed3) {
            System.out.println("побеждают срузу две машины: " + name1 + " и " + name2);


        }
    }
}*/
