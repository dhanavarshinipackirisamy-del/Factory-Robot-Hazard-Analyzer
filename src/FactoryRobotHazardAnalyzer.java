import java.util.Scanner;

// UC5: Entry point class
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision (0.0 - 1.0): ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density (1 - 20): ");
        int workerDensity = scanner.nextInt();

        // UC5: Call auditor method
        double riskScore =
                RobotHazardAuditor.calculateHazardRisk(
                        armPrecision,
                        workerDensity
                );

        System.out.println("Robot Hazard Risk Score: " + riskScore);

        scanner.close();
    }
}

