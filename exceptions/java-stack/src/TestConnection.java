public class TestConnection {
    public static void main(String[] args) {

        try (Connection connection = new Connection()) {
            connection.readData();
        } catch (IllegalStateException ex) {
            System.out.println("Connection error.");
        }

//        Connection con = new Connection();
//
//        try {
//            con.readData();
//        } catch(IllegalStateException ex){
//            System.out.println("Connection error.");
//        } finally {
//            con.close();
//        }


    }
}
