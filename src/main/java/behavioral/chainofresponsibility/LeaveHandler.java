package behavioral.chainofresponsibility;

public abstract class LeaveHandler {
    protected LeaveHandler superVisor; // the handler should know about its successor.

    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    public abstract String applyLeave(Leave leave);
}
