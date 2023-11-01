package umc.spring.mapping.memberMission;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member_mission")
@RequiredArgsConstructor
public class MemberMissionController {

    private final MemberMissionRepository memberMissionRepository;


}
