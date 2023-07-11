public interface Authenticable {

    public abstract void setPassword(int password);
    public abstract boolean auth(int password);
}
