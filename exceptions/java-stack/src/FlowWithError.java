public class FlowWithError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        }catch(ArithmeticException | NullPointerException | CustomException ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            //ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
            metodo2();
        System.out.println("Fim do metodo1");
    }
/**
* This method throws a StackOverFlowError;
* Since it's recursive, it will pile up the execution stack and break, showing how important is exception handling
* */
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        metodo2();
        System.out.println("Fim do metodo2");
    }
}
