import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Phonebook {


    public static HashMap<User, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void addContact(String name, Integer phoneNum) {

        Set<String> allUserNames = new HashSet<>();
        for(Map.Entry<User, ArrayList<Integer>> entry : phoneBook.entrySet()) {
            allUserNames.add(entry.getKey().getName());
        }

        if (phoneBook.size() != 0) {
            for(Map.Entry<User, ArrayList<Integer>> entry : phoneBook.entrySet()) {
                if (name == entry.getKey().getName()) {
                    entry.getKey().phoneList.add(phoneNum);
                    phoneBook.get(entry.getKey()).add(phoneNum);

                }
            }
        if (allUserNames.contains(name) == false) {
            phoneBook.put(new User(name, new ArrayList<>(), phoneBook.size() + 1), new ArrayList<>());
            for (Map.Entry<User, ArrayList<Integer>> entry : phoneBook.entrySet()) {
                if (name == entry.getKey().getName()) {
                    entry.getKey().phoneList.add(phoneNum);
                    phoneBook.get(entry.getKey()).add(phoneNum);
                }
            }

            
        }
        }
        else {
            phoneBook.put(new User(name, new ArrayList<>(), 1), new ArrayList<>());
            for (Map.Entry<User, ArrayList<Integer>> entry : phoneBook.entrySet()) {
                entry.getKey().phoneList.add(phoneNum);
                entry.getValue().add(phoneNum);
            }
        }
        
    }

    public HashMap<User, ArrayList<Integer>> getBook() {
        return phoneBook;
    }

    public void removePhone (int phone) {
        for (Map.Entry<User, ArrayList<Integer>> entry : phoneBook.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().contains(phone)) {
                    int index;
                    index = entry.getValue().indexOf(phone);
                    entry.getValue().remove(index);
                }
            }
        }
    }

    public void printSortedPhoneBook() {
        Comparator<Map.Entry<User, ArrayList<Integer>>> comparator = Comparator.comparing(entry -> Integer.valueOf(entry.getValue().size()));
        List<Map.Entry<User, ArrayList<Integer>>> sortedList = new LinkedList<>(phoneBook.entrySet());
        sortedList.sort(comparator.reversed());

        for (Map.Entry<User, ArrayList<Integer>> entry : sortedList) {
            System.out.println(entry);
        }
    }
}
