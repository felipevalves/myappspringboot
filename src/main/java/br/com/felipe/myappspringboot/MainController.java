package br.com.felipe.myappspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/springboot")
    public String index(final Model model)
    {
        return "index";
    }

}
