import java.math.BigDecimal;
import java.math.BigInteger;

// Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
//Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
public class Main {
    public static void main(String[] args) throws Exception {
        BigDecimal num = new BigDecimal("10.5");
        BigDecimal num1 = new BigDecimal("2.5");
        operazioni operazione = operazioni.ADDIZIONE;
        System.out.println(calcoloOperazione(num, num1, operazione));

    }
    public enum operazioni {
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MIN,
        MAX
    }
    public static BigDecimal calcoloOperazione(BigDecimal num, BigDecimal num1, operazioni operazione) throws Exception {
        BigDecimal risultato = BigDecimal.ZERO;

        switch (operazione){
            case ADDIZIONE -> {
                risultato = num.add(num1);
                break;
            }
            case SOTTRAZIONE -> {
                risultato = num1.subtract(num1);
                break;
            }
            case MOLTIPLICAZIONE -> {
                risultato = num.multiply(num1);
                break;
            }
            case DIVISIONE -> {
                if (num1.compareTo(BigDecimal.ZERO) != 0){
                    risultato = num.divide(num1, 2, BigDecimal.ROUND_HALF_UP);
                } else {
                    throw new Exception("errore");
                }
                break;
            }
            case MIN -> {
                risultato = num.min(num1);
                break;
            }
            case MAX -> {
                risultato = num.max(num1);
                break;
            }
        }
        return risultato;
    }
}
