package dev.waougri.maintenanceapp.Enumerations;

public enum JobStatus {
    JOB_DONE("JOB_DONE"),
    JOB_ON_HOLD("JOB_ON_HOLD"),
    JOB_INCOMPLETE("JOB_NOT_DONE")
    ;

    private final String jobStatus;

    JobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }
    public String getJobStatus()
    {
        return this.jobStatus;
    }
}
