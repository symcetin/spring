package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model) {
        List<Mentor> mentorList  = new ArrayList<>();
       mentorList.add(new Mentor("Mike","Smith",34, Gender.MALE));

        mentorList.add( new Mentor("Muhtar","Muhtaro",31, Gender.MALE));
        mentorList.add( new Mentor("Ammy","Hanks",38, Gender.MALE));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";
    }

    }
