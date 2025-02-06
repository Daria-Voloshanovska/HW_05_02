import java.util.*;
public class PersonArrayHandler {
    private Person[] array;

    public PersonArrayHandler(Person[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        String result = "";
        for (Person person : array) {
            result += person + System.lineSeparator();
        }
        return result;
    }

    public Person get(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        } else {
           return array[index];
        }
    }


    public int indexOdMaxAgePerson(int index) {
        int maxIndex = Math.max(index,0) ;
        for (int i = index; i < array.length; i++) {
            if (array[i].getAge() > array[maxIndex].getAge()){
                maxIndex = i;
            }

        }
        return maxIndex>=array.length?-1:maxIndex;
    }

    public int indexOfMaxAgePerson(){
        return indexOdMaxAgePerson(0);
    }

    public boolean isPersonExists(Person person) {
        for (Person p : array) {
            if (p.equals(person)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPersonExists(Person[] persons) {
        for (Person p : persons) {
            if (!isPersonExists(p)) {
                return false;
            }
        }
        return true;
    }

    public List<Person> retainAll(Person[] persons) {
        List<Person> retained = new ArrayList<>();
        for (Person p : persons) {
            if (isPersonExists(p)) {
                retained.add(p);
            }
        }
        return retained;
    }

}
