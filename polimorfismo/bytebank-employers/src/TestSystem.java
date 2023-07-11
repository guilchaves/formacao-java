public class TestSystem {

    public static void main(String[] args) {
        Manager m = new Manager();
        m.setPassword(222);

        InternalSystem is = new InternalSystem();
        is.auth(m);
    }
}
