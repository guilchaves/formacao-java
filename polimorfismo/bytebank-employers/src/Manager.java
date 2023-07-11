public class Manager extends Employee implements Authenticable {

    private int password;

    public double getBonus(){
        return super.getSalary();
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean auth(int password) {
        return this.password == password;
    }
}
