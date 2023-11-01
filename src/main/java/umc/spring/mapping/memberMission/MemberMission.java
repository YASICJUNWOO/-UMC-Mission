package umc.spring.mapping.memberMission;

import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.member.Member;
import umc.spring.domain.mission.Mission;

import javax.persistence.*;

@Entity
public class MemberMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;

    private String status;

}
