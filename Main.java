
public class Main {
    public static void main(String[] args) {

        Phonebook myPhonebook = new Phonebook();

        myPhonebook.addContact("Васильев", 111111);
        myPhonebook.addContact("Андреев", 222222);
        myPhonebook.addContact("Иванов", 333333);
        myPhonebook.addContact("Васильев", 444444);
        myPhonebook.addContact("Васильев", 555555);
        myPhonebook.addContact("Андреев", 666666);

        System.out.println(myPhonebook.getBook());
        myPhonebook.removePhone(222222);
        System.out.println(myPhonebook.getBook());
        myPhonebook.printSortedPhoneBook();





    }
}
