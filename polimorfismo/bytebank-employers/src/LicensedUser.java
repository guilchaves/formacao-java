public class LicensedUser implements Authenticable {

    private int password;
    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean auth(int password) {
        return this.password == password;
    }
}
