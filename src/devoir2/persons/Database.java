package devoir2.persons;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darius on 2/28/2017.
 */
public class Database {

    private List<Person> personList = new ArrayList<>();

    public Database() {
    }

    void insertPerson(Person person){
        personList.add(person);
    }
}
