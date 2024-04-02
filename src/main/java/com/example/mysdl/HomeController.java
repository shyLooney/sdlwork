package com.example.mysdl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    private RedisStudentRepository repository;

    public HomeController(RedisStudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getHome(Model model) {
        model.addAttribute("students", repository.findAll());
        return "start";
    }

    @PostMapping("/")
    public String addStudent(Student student) {
        repository.save(student);
        return "redirect:/";
    }
}
