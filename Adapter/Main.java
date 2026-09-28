package Adapter;

public class Main {
    public void main() {
        JsonPaymentProcessor modernProcessor = new ModernPaymentSystem();
        modernProcessor.processPayment("{\"amount\": 1500, \"currency\": \"USD\"}");

        IO.println("\n--- Procesando a través del adaptador legado ---");
        LegacyXmlBankService legacyBank = new LegacyXmlBankService();
        JsonPaymentProcessor adapter = new XmlToPaymentAdapter(legacyBank);

        adapter.processPayment("{\"amount\": 3000, \"currency\": \"EUR\"}");
    }
}