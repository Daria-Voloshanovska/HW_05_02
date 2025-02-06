import java.util.*;
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 26),
                new Person("Oleg", 43),
                new Person("David", 35),
                new Person("John", 19)
        };
        PersonArrayHandler handler = new PersonArrayHandler(people);
        System.out.println(handler);
        System.out.println("Index of oldest person : " + handler.get(handler.indexOdMaxAgePerson(3)));

        System.out.println("Index of oldest person from index 1: " + handler.indexOdMaxAgePerson(1));

        System.out.println("Is Oleg exists: " + handler.isPersonExists(new Person("Oleg", 43)));

        Person[] checkPeople = {new Person("Alice", 26), new Person("John", 19)};
        System.out.println("Are Alice and John exist: " + handler.isPersonExists(checkPeople));

        List<Person> retained = handler.retainAll(checkPeople);
        System.out.println("Retained persons: " + retained);

    }
}

/*

Создайте класс Person(String name, int age). Создайте класс PersonArrayHandler, с единственным полем Person[] array.  Сам массив может задаваться в конструкторе. Реализуйте несколько методов:
toString() (Arrays.toString не используем!)
int indexOfMaxAgePerson() - метод, который вернет index самого взрослого Person. Предположим, что возраст у всех Person разный, повторов нет.
int indexOfMaxAgePerson(int index) - метод, который вернет index самого взрослого Person, начиная с заданного index Предположим, что возраст у всех Person разный, повторов нет.
boolean isPersonExists(Person person) - метод, который есть ли заданный Person в нашем массиве
boolean isPersonExists(Person[] person) - метод, который есть ли все Person из массива Person[] person  в нашем массиве
[По желанию]*  List  retainAll(Person[] person ) Формирует ArrayList из всех Person,  которые входят и в переданный массив и в наш массив
 */