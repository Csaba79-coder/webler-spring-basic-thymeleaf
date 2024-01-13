package hu.webler.weblerspringbasicthymeleaf.controller;

import hu.webler.weblerspringbasicthymeleaf.bootstrap.DataInitializer;
import hu.webler.weblerspringbasicthymeleaf.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StudentController {

    private final DataInitializer dataInitializer;

    /*public StudentController(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }*/

    @GetMapping("/students")
    public List<Student> getStudents() {
        // Visszaadjuk a diákok listáját REST API-n keresztül
        return dataInitializer.getStudents();
    }
}
