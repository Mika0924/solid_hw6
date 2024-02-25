package homework;

public class User implements PersisterRepository{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(){
        Persister persister = new Persister(this);
        System.out.println("Save user: " + getName());
    }

    public void report(){
        System.out.println("Report for user: " + name);
    }
}
