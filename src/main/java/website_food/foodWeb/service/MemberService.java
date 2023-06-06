package website_food.foodWeb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import website_food.foodWeb.dto.MemberDTO;
import website_food.foodWeb.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
    }
}
