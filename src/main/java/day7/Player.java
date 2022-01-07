package day7;

class Player {
    int stamina;
    final int MAX_STAMINA = 100, MIN_STAMINA = 0;
    public static int countPlayers = 0;

    Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers >= 6) {

        } else {
            countPlayers += 1;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        stamina -= 1;
        if(stamina == MIN_STAMINA) countPlayers -= 1;
    }

    public static void info() {
        if(countPlayers < 6) {
            System.out.println("Команды неполные. На поле ещё есть " + (6 - countPlayers) + " мест");
        } else {
            System.out.println("Свободных мест нет");
        }
    }
}
