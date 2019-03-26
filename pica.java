import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ArithmeticException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class picalc {
    public static void main(String[] args) throws Exception {

        BigDecimal pi = new BigDecimal("0");
        BigDecimal x = new BigDecimal("1");
        BigDecimal rekordpi = new BigDecimal("0");
        BigDecimal oficpi = new BigDecimal("3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862"); // oficialne
                                                                                                          // vypocitane
                                                                                                          //PI
        BigDecimal tmpi = new BigDecimal("0");
        BigDecimal one = new BigDecimal("1");
        BigDecimal two = new BigDecimal("2");
        BigDecimal four = new BigDecimal("4");

        for (long i = 0;; i++) {
            try {
                // Kalkulace PI
                if (i % 2 == 0) {
                    pi = pi.add(one.divide(x));
                } else {
                    pi = pi.subtract(one.divide(x));
                }
                x = x.add(two);
                tmpi = pi.multiply(four); // docasne pi pro ulehceni pocitani
            } catch (Exception e) {
            }

            // porovnani PI a vyhodnoceni nejlepsi dosazene PI

            // BigDecimal
            BigDecimal podoba = oficpi.subtract(tmpi);
            BigDecimal NejlepsiPodoba = oficpi.subtract(rekordpi);

            // absolutni hodnota
            // BigDecimal podoba = Math.abs(oficpi - tmpi);
            // BigDecimal NejlepsiPodoba = Math.abs(oficpi - rekordpi);

            // normalni hodnota
            // BigDecimal podoba = oficpi - tmpi;
            // BigDecimal NejlepsiPodoba = oficpi - rekordpi;

            // prepsani rekordu a vypsani do konzole + txt
            if (podoba.compareTo(NejlepsiPodoba) < 0) {
                NejlepsiPodoba = podoba;
                rekordpi = tmpi;
                // System.out.print("\r\t\t\t | " + i + " : " + rekordpi);
                System.out.println(" | " + i + " : " + rekordpi);

                // VOLA FUNKCI PRO PSANI DO TXT
                // writetotxt(rekordpi);
            }

            // vypise kolikrat "for" probehlo
            System.out.print("\r" + i + " " + tmpi + " " + pi);

            // Jestlize se moje PI shoduje s oficialnim PI, vypise tohle.
            BigDecimal check = rekordpi;
            if (check == oficpi) {
                check = check.add(one);
                System.out.println("OFICIALNI PI DOSAZENO!!");
                // writetotxt(rekordpi);
            }
        } // main for
    } // main

    // Funkce psani rekordniho PI do txt souboru
    /*
     * public static void writetotxt(BigDecimal rekordpi) throws Exception {
     * 
     * // premeni PI(double) na string pro zapsani do txt String rpiString =
     * BigDecimal.toString(rekordpi);
     * 
     * File file = new File("C:/Users/rpetr/OneDrive/Plocha/MojePI.txt"); FileWriter
     * fr = null; BufferedWriter br = null; try { fr = new FileWriter(file); br =
     * new BufferedWriter(fr); br.write(rpiString); } catch (IOException e) {
     * e.printStackTrace(); } finally { try { br.close(); fr.close(); } catch
     * (IOException e) { e.printStackTrace(); } } } // writetotxt
     */
} // class
