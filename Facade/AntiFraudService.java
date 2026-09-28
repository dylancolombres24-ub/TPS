package Facade;

public class AntiFraudService {
    public boolean isClearOfRisk(String nationalId) {
        IO.println("Ejecutando algoritmos antifraude para ID: " + nationalId);
        return true;
    }
}
