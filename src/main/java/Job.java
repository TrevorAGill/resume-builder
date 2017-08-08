import java.util.ArrayList;


public class Job {
    private String title;
    private String companyName;
    private String companyLocation;
    private String description;
    private String datesOfEmployment;

    public static ArrayList<Job> allJobs = new ArrayList<Job>();
    public static int jobCount = 0;

    public Job(String title,String companyName,String companyLocation,String description,String datesOfEmployment){
        this.title = title;
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.description = description;
        this.datesOfEmployment = datesOfEmployment;
        allJobs.add(this);
        jobCount += 1;
    }

    public static ArrayList<Job> deleteJob(int getJobCount, ArrayList<Job> allJobs) {
        if (getJobCount > allJobs.size() || getJobCount <= 0) {
            return null;
        } else {
            allJobs.remove(getJobCount - 1);
            return allJobs;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public String getDescription() {
        return description;
    }

    public String getDatesOfEmployment() {
        return datesOfEmployment;
    }
    public static ArrayList<Job> getAll(){
        return allJobs;
    }
}
