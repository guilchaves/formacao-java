
public class InternalSystem {
    private int password = 222;

    public void auth(Manager m) {
        boolean authorized = m.auth(this.password);

        if(authorized){
            System.out.println("Access granted.");
            return;
        }
        System.out.println("Access denied.");
    }
}
