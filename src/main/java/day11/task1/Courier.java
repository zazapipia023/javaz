package day11.task1;

class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public void doWork() {
        warehouse.CountDeliveredOrdersPlus();
        salary += 100;
    }

    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed == true) {
            System.out.println("Бонус уже выплачен");
            return;
        }
        isPayed = true;
        System.out.println("Бонус выплачен");
    }

    @Override
    public String toString() {
        return "Зарплата: " + salary + ", выплачен ли бонус: " + isPayed;
    }
}
