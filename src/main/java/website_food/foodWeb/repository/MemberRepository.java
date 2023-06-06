package website_food.foodWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import website_food.foodWeb.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
