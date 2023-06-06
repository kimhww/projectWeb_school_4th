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

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signUp")
    public String signUpPage() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("membercontroller.save");
        System.out.println("memberDTO = " + memberDTO);
        return null;
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
