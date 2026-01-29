// UC6: Custom exception for robot safety violations
public class RobotSafetyException extends Exception {

    // Constructor to pass custom error message
    public RobotSafetyException(String message) {
        super(message);
    }
}
