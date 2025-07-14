import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int [] payout = {12341, 3453, 34231313, 52452, 23549};
double payoutMonth = 0;
for (int i  = 0; i < payout.length; i++){
    payoutMonth = payoutMonth + payout[i];
}
        BigDecimal l  = new BigDecimal(payoutMonth);
        System.out.println("Сумма трат за месяц составила " + l + " рублей.");
// 1 dz
        int minPayout = payout[0];
        int maxPayout = payout[0];
        for (int i = 0; i < payout.length; i++){
            if (minPayout>payout[i]){
                minPayout = payout[i];
            }
            if (maxPayout < payout[i]) {
                maxPayout = payout[i];
            }
        }
        System.out.println("Минимальная сумма затрат за неделю составила " + minPayout + " рублей. Максимальная сумма трат за неделю составила "+ maxPayout + " рублей.");
       double averagePayoutMonth = payoutMonth / payout.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayoutMonth + " рублей.");
        //3 dz
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char letter = reverseFullName[0];
        for (int i = (reverseFullName.length - 1); i >= 0; i--){
letter = reverseFullName [i];
            System.out.print(letter);
        }
        //4 dz
    }
}