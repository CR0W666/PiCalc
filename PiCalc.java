import java.math.BigDecimal;

class PiCalc {
    public static void main(String[] args) {

        BigDecimal pi = new BigDecimal("0");
        BigDecimal tmpi = new BigDecimal("0");

        for (long i = 0;; i++) {

            pi = pi.add(BigDecimal.valueOf(Math.pow(-1, i) / (2 * i + 1)));  

            System.out.println(i + " | " + pi.multiply(BigDecimal.valueOf(4)));    
        }
    }
}