package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker) {
        for(int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(0, false, warehouse1);
        Courier courier1 = new Courier(0, false, warehouse1);

        businessProcess(picker1);
        businessProcess(courier1);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(0, false, warehouse2);
        Courier courier2 = new Courier(0, false, warehouse2);

        businessProcess(picker2);
        businessProcess(courier2);

        System.out.println("второй склад");
        System.out.println(warehouse2);
        System.out.println(picker2);
        System.out.println(courier2);

        System.out.println("первый склад");
        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);
    }
}
