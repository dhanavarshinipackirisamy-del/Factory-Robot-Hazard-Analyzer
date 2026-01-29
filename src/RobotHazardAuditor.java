// UC5: Business logic class
public class RobotHazardAuditor {

    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity
    ) {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Invalid Arm Precision");
            return 0.0;
        }

        if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Invalid Worker Density");
            return 0.0;
        }

        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * 1.0);
    }
}
