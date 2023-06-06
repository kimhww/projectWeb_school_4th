package website_food.foodWeb.entity;

import lombok.Cleanup;
import lombok.CustomLog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name="member_table")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String eMail;

    @Column
    private String password;

    @Column
    private String checkPassword;

    @Column
    private String birth;

    @Column
    private String username;
}
