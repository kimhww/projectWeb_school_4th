package website_food.foodWeb.entity;

import lombok.Cleanup;
import lombok.CustomLog;
import lombok.Getter;
import lombok.Setter;
import website_food.foodWeb.dto.MemberDTO;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name="member_table")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String checkPassword;

    @Column(unique = true)
    private String email;

    @Column
    private String birth;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUsername(memberDTO.getUsername());
        memberEntity.setPassword(memberDTO.getPassword());
        memberEntity.setCheckPassword(memberDTO.getCheckPassword());
        memberEntity.setEmail(memberDTO.getEMail());
        memberEntity.setBirth(memberDTO.getBirth());
        return memberEntity;
    }
}
