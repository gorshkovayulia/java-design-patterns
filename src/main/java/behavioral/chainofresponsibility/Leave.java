package behavioral.chainofresponsibility;

/**
 * 'numberOfDays', 'employeeTier' and 'reason' are the facts, that the company going to consider
 * before approving the leave request. Based on these facts, the leave request will forward to a specific person (leave handler),
 * who can handle those requests.
 */
public class Leave {

    private int numberOfDays;
    private int employeeTier;
    private ReasonType reason;

    public Leave(int numberOfDays, int empTier, ReasonType reason) {
        this.numberOfDays = numberOfDays;
        this.employeeTier = empTier;
        this.reason = reason;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getEmployeeTier() {
        return employeeTier;
    }

    public ReasonType getReason() {
        return reason;
    }
}
