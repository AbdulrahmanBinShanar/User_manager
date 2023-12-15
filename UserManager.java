import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        System.out.println("List of Users:");
        for (User user : users) {
            System.out.println("Username: " + user.getUsername() + ", Email: " + user.getEmail());
        }
    }

}
