import java.util.*;

import clients.Person;

public class Main {

    //Цена катания в билетах
    public static final int PRICE = 1;
    public static void main(String[] args) throws Exception {

        Queue<Person> queue = generateClients();

        while (!queue.isEmpty()) {
            Person nextClient = queue.poll();
            System.out.println(nextClient.getName() + " " + nextClient.getSurname() + " прокатился на аттракционе.");
            nextClient.setTicketAmount(PRICE);
            if (nextClient.getTicketAmount() != 0) {
                queue.offer(nextClient);
            }
            Thread.sleep(1000);
        }
    }

    //Гости сегодняшней программы:
    public static Queue generateClients() {
        Queue queue = new LinkedList();
        queue.offer(new Person("Boris", "Yeltsin", 3));
        queue.offer(new Person("Evgeny", "Prigozin", 1));
        queue.offer(new Person("Alexey", "Panfilov", 1));
        queue.offer(new Person("Alena", "Zargekova", 2));
        queue.offer(new Person("Georgy", "Vlasov", 4));
        queue.offer(new Person("Filip", "Voronov", 2));
        return queue;
    }
}