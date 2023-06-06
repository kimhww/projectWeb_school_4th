package website_food.foodWeb.dto;

import lombok.*;
import website_food.foodWeb.entity.MemberEntity;

import java.lang.reflect.Member;

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

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setId(memberEntity.getId());
        memberDTO.setUsername(memberEntity.getUsername());
        memberDTO.setPassword(memberEntity.getPassword());
        memberDTO.setCheckPassword(memberEntity.getCheckPassword());
        memberDTO.setEMail(memberEntity.getEmail());
        memberDTO.setBirth(memberEntity.getBirth());

        return memberDTO;
    }
}
