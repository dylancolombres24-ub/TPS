package Facade;

public class AccountBalanceService {
    public boolean hasMinimumBalance(String accountId, double requiredAmount) {
        IO.println("Verificando balance mínimo ($" + requiredAmount + ") en cuenta: " + accountId);
        return true;
    }
}
