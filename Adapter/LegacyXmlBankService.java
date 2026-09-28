package Adapter;

public class LegacyXmlBankService {
    public void executeXmlTransaction(String xmlData) {
        IO.println("Servicio Legado ejecutando transacción XML: " + xmlData);
    }
}