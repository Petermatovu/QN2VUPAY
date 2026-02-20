public class PatientReport {

    // Format 1: Basic report with just patient name
    public void generateReport(String patientName) {
        System.out.println("========================================");
        System.out.println("=== Basic Report ===");
        System.out.println("Patient: " + patientName);
        System.out.println("========================================");
    }

    // Format 2: Detailed report with name and diagnosis
    public void generateReport(String patientName, String diagnosis) {
        System.out.println("========================================");
        System.out.println("=== Detailed Report ===");
        System.out.println("Patient   : " + patientName);
        System.out.println("Diagnosis : " + diagnosis);
        System.out.println("========================================");
    }

    // Format 3: Full report with name, diagnosis, and ward number
    public void generateReport(String patientName, String diagnosis, int wardNumber) {
        System.out.println("========================================");
        System.out.println("=== Full Report ===");
        System.out.println("Patient   : " + patientName);
        System.out.println("Diagnosis : " + diagnosis);
        System.out.println("Ward      : " + wardNumber);
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        PatientReport report = new PatientReport();

        // Same method name, different parameters
        report.generateReport("Akello Grace");
        report.generateReport("Okello Tom", "Malaria");
        report.generateReport("Apiyo Ruth", "Typhoid", 3);
    }
}
