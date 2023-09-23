package Toys;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {

    SaveT0File save = new SaveT0File();
    public Comparator<Toy> ToyComparator = new Comparator<Toy>() {
        @Override
        public int compare(Toy o1, Toy o2) {
            return (o2.getFreq() - o1.getFreq());
        }
    };

    PriorityQueue<Toy> queue = new PriorityQueue(ToyComparator);

    public void add(Toy toy) {
        queue.add(toy);
    }


    public void get() {
        Toy toy = queue.poll();
        if (toy == null) {
            save.save("Игрушек в розыгрыше не было");
            throw new RuntimeException("Не добавлены игрушки!");
        } else
            save.save(toy.toString());
        System.out.println("Игрушка с id=" + toy.getId());
    }

    @Override
    public String toString() {
        return "PriorityQ{" +
                "queue=" + queue +
                '}';
    }
}



