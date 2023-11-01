package umc.spring.domain.review;

import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.member.Member;
import umc.spring.domain.store.Store;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    private String body;

    private Float score;
}
