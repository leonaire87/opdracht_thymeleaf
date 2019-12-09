package be.ehb.opdracht_thymeleaf.controllers;

import be.ehb.opdracht_thymeleaf.model.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/studenten")
public class StudentController {

    @Autowired
    StudentDAO dao;

    @RequestMapping(value = "/{studentId}", method = RequestMethod.GET)
    public String student(ModelMap map, @PathVariable(name = "studentId")int studentId) {

        map.addAttribute("student", dao.findById(studentId).get());
        return "student";


    }
}
