public class Connection {
    public Connection(){
        System.out.println("Opening connection...");
    }

    public void readData(){
        System.out.println("Receiving data...");
        throw new IllegalStateException();
    }

    public void close(){
        System.out.println("Closing connection.");
    }
}
