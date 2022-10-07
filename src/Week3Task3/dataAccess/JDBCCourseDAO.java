package Week3Task3.dataAccess;

import Week3Task3.entities.Course;

public class JDBCCourseDAO implements ICourseDAO{
    public void add(Course course){
        System.out.println("Course: " + course.getName() + " was added with JDBC");
    }
}
