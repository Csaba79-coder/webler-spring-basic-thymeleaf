package hu.webler.weblerspringbasicthymeleaf.controller;

import hu.webler.weblerspringbasicthymeleaf.bootstrap.DataInitializer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thy")
@RequiredArgsConstructor
public class StudentWebController {

    // https://www.thymeleaf.org/doc/tutorials/2.1/usingthymeleaf.html

    private final DataInitializer dataInitializer;

    /*public StudentWebController(DataInitializer dataInitializer) {
        this.dataInitializer = dataInitializer;
    }*/

    @GetMapping("/students")
    public String home(Model model) {
        // A Thymeleaf template-be továbbítjuk a diákok listáját
        model.addAttribute("students", dataInitializer.getStudents());
        return "index";
    }
}
