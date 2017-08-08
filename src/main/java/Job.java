import java.util.ArrayList;


public class Job {
    private String title;
    private String companyName;
    private String companyLocation;
    private String description;
    private String datesOfEmployment;

    public static ArrayList<Job> allJobs = new ArrayList<Job>();

    public Job(String title,String companyName,String companyLocation,String description,String datesOfEmployment){
        this.title = title;
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.description = description;
        this.datesOfEmployment = datesOfEmployment;
        allJobs.add(this);
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
