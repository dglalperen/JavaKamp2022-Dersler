package Week3Task3.business;

import NLayeredApp.core.logging.Logger;
import NLayeredApp.entities.Product;
import Week3Task3.core.logging.ILogger;
import Week3Task3.dataAccess.ICourseDAO;
import Week3Task3.entities.Course;

import java.util.ArrayList;
import java.util.Objects;

public class CourseManager {
   private ICourseDAO courseDAO;

   private ArrayList<Course> courses = new ArrayList<Course>();

   private ILogger[] loggers;

    public void getCourses() {
        System.out.println("My Courses: ");
        for (Course currCourse: this.courses) {
            System.out.println("- "+ currCourse.getName());
        }
    }

    public CourseManager(ICourseDAO courseDAO, ILogger[] loggers) {
        this.courseDAO = courseDAO;
        this.loggers = loggers;
    }

    public void addCourse(Course course) throws Exception{
       if(this.courses.size() > 0){
           for (Course currentCourse: this.courses) {
               if(currentCourse.getName() == course.getName()){
                   throw new Exception("Name already used!");
               } else if(currentCourse.getCategoryName() == course.getCategoryName()){
                   throw new Exception("Category name already used!");
               }
           }
       }
       if(course.getPrice() < 0){
           throw new Exception("Price has to be greater than 0");
       }
       this.courses.add(course);
       this.courseDAO.add(course);
   }
}
