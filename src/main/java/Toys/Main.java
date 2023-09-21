package Toys;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1,"Плюшевый мишка",1);
        Toy toy2 = new Toy(2,"Надувной жираф",2);
        Toy toy3 = new Toy(3,"Конструктор Lego",3);
//        ArrayList array1=new ArrayList();
//        ArrayList array2=new ArrayList();
//        ArrayList array3=new ArrayList();
//        array1.add(toy1);
//        array2.add(toy2);
//        array3.add(toy3);
//        System.out.println(array1);
//        System.out.println(array2);
//        System.out.println(array3);
        PriorityQ queue=new PriorityQ();
         queue.add(toy1);
        queue.add(toy2);
        queue.add(toy3);
        queue.get();
      }
}