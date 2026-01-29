import java.util.Scanner;

// UC7: Entry point class
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision (0.0 - 1.0): ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density (1 - 20): ");
        int workerDensity = scanner.nextInt();

        scanner.nextLine(); // clear buffer

        System.out.print(
                "Enter Machinery State (Worn/Faulty/Critical): "
        );
        String machineryState = scanner.nextLine();

        try {
            double riskScore =
                    RobotHazardAuditor.calculateHazardRisk(
                            armPrecision,
                            workerDensity,
                            machineryState
                    );

            System.out.println(
                    "Robot Hazard Risk Score: " + riskScore
            );

        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
