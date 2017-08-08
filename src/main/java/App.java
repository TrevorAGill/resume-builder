import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/" , (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Job> allJobs = Job.getAll();
            model.put("allJobs",allJobs);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        post("/job/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String title = request.queryParams("title");
            String companyName = request.queryParams("companyName");
            String companyLocation = request.queryParams("companyLocation");
            String description = request.queryParams("description");
            String datesOfEmployment = request.queryParams("datesOfEmployment");
            Job newJob = new Job(title,companyName,companyLocation,description,datesOfEmployment);
            response.redirect("/");
            return null;
        });
    }
}
