import java.util.Scanner;

// UC6: Entry point with exception handling
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision (0.0 - 1.0): ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density (1 - 20): ");
        int workerDensity = scanner.nextInt();

        try {
            double riskScore =
                    RobotHazardAuditor.calculateHazardRisk(
                            armPrecision,
                            workerDensity
                    );

            System.out.println(
                    "Robot Hazard Risk Score: " + riskScore
            );

        } catch (RobotSafetyException e) {
            // UC6: Exception itself displays message
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

