package website_food.foodWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import website_food.foodWeb.dto.MemberDTO;

@Controller
public class webController {

    @GetMapping("/home")
    public String home() {
        return "home";
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
