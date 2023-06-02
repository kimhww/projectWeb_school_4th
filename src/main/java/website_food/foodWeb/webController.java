package website_food.foodWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {

    @GetMapping("/home")
    public String boardWriteForm() {
        return "home";
    }

}
