package swproject.swproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("data", "test_data");
        return "main";
    }
}
