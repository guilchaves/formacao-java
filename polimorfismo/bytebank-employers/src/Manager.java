public class Manager extends Employee {

    private int password;

    public double getBonus(){
        return super.getSalary();
    }

    public void setPassword(int password){
        this.password = password;
    }

    public boolean auth(int password){
        return this.password == password;
    }
}
