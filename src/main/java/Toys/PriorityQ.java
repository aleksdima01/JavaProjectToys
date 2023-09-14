package Toys;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {


    public  Comparator<Toy> ToyComparator = new Comparator<Toy>(){
        @Override
        public int compare(Toy o1, Toy o2) {
            return  (o2.getFreq() - o1.getFreq());
        }

    };

        PriorityQueue<Toy>queue=new PriorityQueue(ToyComparator);

        public void add(Toy toy){
                queue.add(toy);
            }


        public void get() {
        //    while (true) {
                Toy toy = queue.poll();
             //   if (toy == null) break;
                System.out.println("Игрушка с id=" + toy.getId());
            }
        }


