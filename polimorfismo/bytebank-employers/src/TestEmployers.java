public class TestEmployers {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setName("John");
        m1.setSalary(5000.0);

        SoftwareEngineer se1 = new SoftwareEngineer();
        se1.setName("Marko");
        se1.setSalary(4000.0);

        Designer d1 = new Designer();
        d1.setName("Iris");
        d1.setSalary(4500.0);

        System.out.println("Name: " + m1.getName() + " Bonus: " + m1.getBonus());
        System.out.println("Name: " + se1.getName() + " Bonus: " + se1.getBonus());
        System.out.println("Name: " + d1.getName() + " Bonus: " + d1.getBonus());

//        m1.setPassword(2222);
//        boolean authorized = m1.auth(2222);
//        System.out.println(authorized);

        BonusRegister control = new BonusRegister();
        control.register(m1);
        control.register(se1);
        control.register(d1);

        System.out.println(control.getSum());



    }
}
