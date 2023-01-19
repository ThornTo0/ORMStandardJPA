package chap05_referenceMapping.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter
@Table(name = "chap05_MEMBER")
public class chap05_MEMBER {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String name;

//    @Column(name = "TEAM_ID")
//    private Long teamId;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private chap05_Team team;

    public chap05_MEMBER() {}

    public void setTeam(chap05_Team team) {
        this.team = team;
    }
}
