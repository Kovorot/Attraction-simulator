import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import clients.Person;

public class Main {
    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();

        while (!queue.isEmpty()) {
            Person next = queue.poll();
            System.out.println(next.present()  + " прокатился на аттракционе.");
        }
    }

    public static List<Person> generateClients() {
        List list = new LinkedList();
        list.add(new Person("Boris", "Yeltsin", 3));
        list.add(new Person("Evgeny", "Prigozin", 1));
        list.add(new Person("Alexey", "Panfilov", 1));
        list.add(new Person("Alena", "Zargekova", 2));
        list.add(new Person("Georgy", "Vlasov", 4));
        list.add(new Person("Filip", "Voronov", 2));
        return list;
    }
}