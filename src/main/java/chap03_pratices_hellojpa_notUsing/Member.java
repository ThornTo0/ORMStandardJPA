//package pratices_hellojpa_notUsing;
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Data
//@Entity
//@Table(name = "Members")
//public class Member {
//
//    @Id
//    private Long id;
//    @Column(name = "name")
//    private String username;
//    private Integer age;
//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;
//
////    private LocalDate testLocalDate;
////    private LocalDateTime testLocalDate2;
//
//    @Lob
//    private String description;
//
//    public Member() { }
//}
