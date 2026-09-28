package Facade;

public class Main {
    public void main() {
        // El cliente solo interactúa con la fachada
        LoanApprovalFacade loanFacade = new LoanApprovalFacade();

        boolean approved = loanFacade.approveLoan("ARG-40123899", "ACC-99812", 250000.0);
        System.out.println("Resultado de la solicitud: " + (approved ? "Aceptado" : "Denegado"));
    }
}
