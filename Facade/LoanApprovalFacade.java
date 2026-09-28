package Facade;

public class LoanApprovalFacade {
    private final CreditHistoryService creditService;
    private final AccountBalanceService balanceService;
    private final AntiFraudService fraudService;

    public LoanApprovalFacade() {
        this.creditService = new CreditHistoryService();
        this.balanceService = new AccountBalanceService();
        this.fraudService = new AntiFraudService();
    }

    public boolean approveLoan(String nationalId, String accountId, double amount) {
        IO.println("Iniciando evaluación de crédito simplificada...");

        boolean creditOk = creditService.hasGoodCreditRecord(nationalId);
        boolean balanceOk = balanceService.hasMinimumBalance(accountId, amount * 0.10);
        boolean fraudOk = fraudService.isClearOfRisk(nationalId);

        if (creditOk && balanceOk && fraudOk) {
            IO.println(">>> Crédito APROBADO exitosamente.");
            return true;
        } else {
            IO.println(">>> Crédito RECHAZADO por criterios de riesgo.");
            return false;
        }
    }
}
