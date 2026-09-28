package Adapter;

public class XmlToPaymentAdapter implements JsonPaymentProcessor {
    private final LegacyXmlBankService legacyService;

    public XmlToPaymentAdapter(LegacyXmlBankService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void processPayment(String jsonRequest) {
        // Conversión simplificada de JSON a XML para simular la adaptación
        String xmlConverted = jsonRequest
                .replace("{", "<transaction>")
                .replace("}", "</transaction>")
                .replace("\"", "")
                .replace(":", ">")
                .replace(",", "</field><field>");

        legacyService.executeXmlTransaction("<data>" + xmlConverted + "</data>");
    }
}
