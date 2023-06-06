package website_food.foodWeb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import website_food.foodWeb.dto.MemberDTO;
import website_food.foodWeb.entity.MemberEntity;
import website_food.foodWeb.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        //1. dto -> entity 변환
        //2. repository의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
        //repository의 save메시드 호출(조건. entity 객체를 넘겨줘야함)


    }
}
