public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double metre = 1.87;
        int kg = 98;
        int bmi =service.calculate(kg , metre);

        System.out.println(bmi);
    }


    }