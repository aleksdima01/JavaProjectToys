package Toys;


public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Плюшевый мишка", 20);
        Toy toy2 = new Toy(2, "Надувной жираф", 40);
        Toy toy3 = new Toy(3, "Конструктор Lego", 70);
        Toy toy4 = new Toy(4, "Машинка", 50);
        Toy toy5 = new Toy(5, "Кораблик", 90);
        Toy toy6 = new Toy(6, "Пазл", 30);
        toy6.setFreq(25);
        PriorityQ queue = new PriorityQ();
        queue.add(toy1);
        queue.add(toy2);
        queue.add(toy3);
        queue.add(toy4);
        queue.add(toy5);
        queue.add(toy6);
        //System.out.println(queue);
        queue.get();
        queue.get();
    }
}