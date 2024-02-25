package homework.hw2variant;

public class Main{
    public static void main(String[] args){

        Repository repository = new Repository(new User("Bob2"), new Persister());
        Repository.report();
        Repository.save();
    }

}