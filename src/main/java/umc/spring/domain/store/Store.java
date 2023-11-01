package umc.spring.domain.store;

import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.region.Region;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Store extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    private String name;

    private String address;

    private float score;

}
