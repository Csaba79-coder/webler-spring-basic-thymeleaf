package hu.webler.weblerspringbasicthymeleaf.bootstrap;

import hu.webler.weblerspringbasicthymeleaf.model.Student;
import lombok.Getter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataInitializer implements CommandLineRunner {

    private final List<Student> students = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        students.add(new Student("John", "Doe", "M."));
        students.add(new Student("Jane", "Doe", "A."));
    }

    /*public List<Student> getStudents() {
        return students;
    }*/
}
