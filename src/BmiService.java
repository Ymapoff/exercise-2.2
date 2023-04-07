public class BmiService {

    public int calculate(int kg, double metre) {
        int result = (int) (kg / (metre*metre));
        return result;

    }

}