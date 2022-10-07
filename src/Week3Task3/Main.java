package Week3Task3;

import Week3Task3.business.CourseManager;
import Week3Task3.core.logging.DatabaseLogger;
import Week3Task3.core.logging.FileLogger;
import Week3Task3.core.logging.ILogger;
import Week3Task3.dataAccess.HibernateCourseDAO;
import Week3Task3.entities.Course;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course("Java Kamp", "Java", 10);
        Course course2 = new Course("C# Kamp", "C#", 100);



        ILogger[] loggers = new ILogger[]{new DatabaseLogger(), new FileLogger()};

        CourseManager myCourseManager = new CourseManager(new HibernateCourseDAO(), loggers);
        myCourseManager.addCourse(course1);
        myCourseManager.addCourse(course2);
        myCourseManager.getCourses();
    }
}
