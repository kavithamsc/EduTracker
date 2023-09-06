package org.launchcode.studentmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("students")
public class studentController {
    List<String> students = new ArrayList<>();
    @GetMapping
    public String displayAllStudents(Model model){

        students.add("Prabhakaran");
        students.add("Kavitha");
        students.add("Selva Kumar");
        students.add("Revathi");
        students.add("Sushant");
        students.add("Nilan");
        model.addAttribute("students", students);
        return "students/index";

    }
    @GetMapping("create")
    public String displayCreateStudentForm(){
        return "students/create";
    }
    @PostMapping("create")
    public String processCreateStudentForm(@RequestParam String studentName){
        students.add(studentName);
        return "redirect:";

    }
}
