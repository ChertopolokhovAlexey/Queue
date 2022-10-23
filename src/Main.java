//https://github.com/ChertopolokhovAlexey/Queue.git
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Person> queue = new ArrayDeque<>();

        List<Person> list = new ArrayList<>();
        generateClients(list);

        for (Person person : list) {
            queue.offer(person);
        }

        lunaPark(queue);

    }
    public static List<Person> generateClients(List list) {

        Person person1 = new Person("Тимофей", "Степучев", 3);
        Person person2 = new Person("Софья","Степучева", 2);
        Person person3= new Person("Степан","Степучев", 4);
        Person person4 = new Person("Ника","Степучева", 5);
        Person person5 = new Person("Матвей","Степучев", 6);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        return list;
    }

    public static void lunaPark(Queue<Person> queue) {
        while (!queue.isEmpty()) {
           for (Person person : queue) {
                System.out.println(person.name +" " + person.surname +
                        " Прокатился на аттракционе!");
                person.tickets = person.tickets - 1;
                if (person.tickets == 0) {
                    queue.remove(person);
               }

            }
            System.out.println("=============");
        }

    }

}
