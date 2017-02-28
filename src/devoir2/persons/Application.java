package devoir2.persons;

/**
 * Created by Darius on 2/28/2017.
 */
public class Application {

    private static Database database = new Database();
    private static Person person;
    private static CreditCard creditCard;
    private static Address address;

    public static void main(String[] args) {

        person = new Person("Gigel");
        creditCard = new CreditCard("1929312847189274");
        person.getCreditCards().add(creditCard);
        creditCard = new CreditCard("6834756897349856");
        person.getCreditCards().add(creditCard);
        address = new Address("Bucharest");
        person.setAddress(address);
        database.insertPerson(person);

        person = new Person("Ionel");
        creditCard = new CreditCard("23423456347456");
        person.getCreditCards().add(creditCard);
        address = new Address("Las Fierbinti");
        person.setAddress(address);
        database.insertPerson(person);
    }
}
