import java.io.IOException;
import java.lang.ArithmeticException;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Picalc {
    public static void main(String[] args) {
        

        BigDecimal pi = new BigDecimal("0");
        BigDecimal tmpi = new BigDecimal("0");
        //BigDecimal rekordpi = new BigDecimal("0");
        //BigDecimal oficpi = new BigDecimal("3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862"); // oficialne
        // vypocitane
        // PI

        for (long i = 0;; i++) {
            pi = pi.add(BigDecimal.valueOf(Math.pow(-1, i) / (2 * i + 1)));
            tmpi = pi.multiply(BigDecimal.valueOf(4));
            System.out.println(i + "|" + tmpi);
        }
    }
}