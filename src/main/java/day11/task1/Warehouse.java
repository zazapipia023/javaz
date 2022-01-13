package day11.task1;

class Warehouse {
    private int countPickedOrders = 0, countDeliveredOrders = 0;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void CountPickedOrdersPlus() {
        countPickedOrders += 1;
    }

    public void CountDeliveredOrdersPlus() {
        countDeliveredOrders += 1;
    }

    @Override
    public String toString() {
        return "Собранных заказов: " + countPickedOrders + ", доставленных заказов: " + countDeliveredOrders;
    }
}
