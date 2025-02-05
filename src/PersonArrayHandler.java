public class PersonArrayHandler {
    private Person[] array;

    public PersonArrayHandler(Person[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        String result = "";
        for (Person person : array){
            result += person+System.lineSeparator();
        }
        return result;
    }
}
