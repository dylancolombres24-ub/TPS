package Adapter;

public class ModernPaymentSystem implements JsonPaymentProcessor {
    @Override
    public void processPayment(String jsonRequest) {
        IO.println("Procesando pago nativo JSON: " + jsonRequest);
    }
}
