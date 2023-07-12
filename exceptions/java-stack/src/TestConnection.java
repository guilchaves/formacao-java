public class TestConnection {
    public static void main(String[] args) {

        Connection con = new Connection();

        try {
            con.readData();
        } catch(IllegalStateException ex){
            System.out.println("Connection error.");
        } finally {
            con.close();
        }
    }
}
