import java.util.ArrayList;

public class User {

    public String userName;
    public ArrayList<Integer> phoneList = new ArrayList<>();
    public int id;

    public User(String userName, ArrayList<Integer> phoneList, int id) {
        this.userName = userName;
        this.phoneList = phoneList;
        this.id = id;
    }

    public User(String userName, ArrayList<Integer> phoneList) {
        this.userName = userName;
        this.phoneList = phoneList; 
    }

    public String getName() {
        return userName;
    }

    public ArrayList<Integer> getPhone() {
        return phoneList;
    }

    @Override
    public String toString() {
        return userName + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return id;
    }



}
