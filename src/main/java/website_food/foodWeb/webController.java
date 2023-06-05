package website_food.foodWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signUp")
    public String signUpPage() {
        return "signUp";
    }

    @GetMapping("/addPlace")
    public String addPlacePage(){
        return "addPlace";
    }

    @GetMapping("/qna")
    public String qnaBoard(){
        return "qnaBoard";
    }

}
