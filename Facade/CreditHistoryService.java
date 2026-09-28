package Facade;

public class CreditHistoryService {
    public boolean hasGoodCreditRecord(String nationalId) {
        IO.println("Consultando buró de crédito para ID: " + nationalId);
        return true;
    }
}