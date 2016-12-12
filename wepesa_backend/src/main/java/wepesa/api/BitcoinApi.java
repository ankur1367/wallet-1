package wepesa.api;

/**
 * Created by harsh on 12/12/16.
 */
public interface BitcoinApi {

    double getBalance(String address);

    boolean sendTransaction(String toAddress, String fromAddress, double amount);
}