package homework.hw2variant;

public class Repository  {
    private static User user;
    private static Persister persister;

    public Repository(User user, Persister persister) {
        this.user = user;
        this.persister = persister;
    }
    public static void save() {
        persister.save(user);
    }
    public static void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
