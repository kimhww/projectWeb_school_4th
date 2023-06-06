package website_food.foodWeb.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String username;
    private String password;
    private String checkPassword;
    private String eMail;
    private String birth;
}
