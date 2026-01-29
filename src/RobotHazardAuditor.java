// UC6: Business logic with exception handling
public class RobotHazardAuditor {

    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity
    ) throws RobotSafetyException {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0"
            );
        }

        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20"
            );
        }

        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * 1.0);
    }
}
