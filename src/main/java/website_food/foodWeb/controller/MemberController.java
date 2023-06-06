package website_food.foodWeb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import website_food.foodWeb.dto.MemberDTO;
import website_food.foodWeb.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberController {
    //생성자 주입
    private final MemberService memberService;

    //로그인 페이지 출력 요청
    @GetMapping("/member/login")
    public String loginPage() {
        return "login";
    }
    //회원가입 페이지 출력 요청
    @GetMapping("/member/signUp")
    public String signUpPage() {
        return "signUp";
    }

    @PostMapping("/member/signUp")
    public String signUp(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("membercontroller.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "login";
    }
}
