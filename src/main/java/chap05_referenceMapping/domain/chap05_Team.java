package chap05_referenceMapping.domain;

import lombok.Getter;
import lombok.Setter;
import totalEx_jpabook.jpashop.domain.Member;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter
public class chap05_Team {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "team")
    private List<chap05_MEMBER> members = new ArrayList<>();

}
