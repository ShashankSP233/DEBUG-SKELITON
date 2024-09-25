class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class UserManager {
    private User User;
    public void setUser(user user) {
        this.user = user;
    }

    public void printUserName() {
        System.out.println("User's name is: " + user.getName());
    }
}

public class Java_nullPointer {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

         userManager.setUser(new User("Alice"));

        userManager.printUserName();

        System.out.println("End of program");
    }
}
