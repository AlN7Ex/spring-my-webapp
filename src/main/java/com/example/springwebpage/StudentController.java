package com.example.springwebpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @GetMapping("/student")
    public String student(@RequestParam(name = "name", defaultValue = "Sir") String name, Model model) {
        model.addAttribute("name", name);
        return "student";
    }
}
