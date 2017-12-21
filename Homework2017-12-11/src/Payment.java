import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Payment {
    public static final String PAYMENTFILEPATH = "src\\Payment.txt";

    // файл типа "id id amount" 3 слова 2 пробела
    String payerId;
    String payeeId;
    Integer amount;

    public Payment(String payerId, String payeeId, Integer amount) {
        this.payerId = payerId;
        this.payeeId = payeeId;
        this.amount = amount;
    }

    public static ArrayList<Payment> getPayments() throws IOException {
         ArrayList<String> payments = new ArrayList();
         ArrayList<Payment> logOfPayments = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(PAYMENTFILEPATH));
        int counter = 0;
        while (reader.ready()) {
            String oneOperationInfo = reader.readLine();
            for (String x : oneOperationInfo.split(" ")) {
                payments.add(x);
            }
            logOfPayments.add(new Payment(payments.get(0 + counter), payments.get(1 + counter), Integer.valueOf(payments.get(2 + counter))));
            counter += 3;

        }

return logOfPayments;
    }
}
