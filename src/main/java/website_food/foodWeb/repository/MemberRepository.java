package website_food.foodWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import website_food.foodWeb.entity.MemberEntity;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회
    Optional<MemberEntity> findByEmail(String email);
}
