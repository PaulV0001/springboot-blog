package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollDice {

    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice";

    }

    @GetMapping("/roll-dice/{guess}")
    public String play(@PathVariable Integer guess, Model vmodel) {

        int rnd = (int) (Math.random() * 6 + 1);

        vmodel.addAttribute("guess", guess);
        vmodel.addAttribute("rnd", rnd);


        return "roll-dice";



    }
}
