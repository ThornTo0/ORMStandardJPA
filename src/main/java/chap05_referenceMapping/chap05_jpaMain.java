package chap05_referenceMapping;

import chap05_referenceMapping.domain.chap05_MEMBER;
import chap05_referenceMapping.domain.chap05_Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.lang.reflect.Member;
import java.util.List;

public class chap05_jpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 데이터베이스 트랜잭션 시작!

        try {

            chap05_Team team = new chap05_Team();
            team.setName("TeamA");
            em.persist(team);

            chap05_MEMBER member = new chap05_MEMBER();
            member.setName("member1");
            member.setTeam(team);
            em.persist(member);

            /*
            em.flush();
            em.clear();
            */

            /* 단방향 예시 */
//            chap05_MEMBER findMember = em.find(chap05_MEMBER.class, member.getId());
//
//            chap05_Team findTeam = findMember.getTeam();
//            System.out.println("findTeam.getName() = " + findTeam.getName());


            /* 양방향 예시 */

            team.getMembers().add(member);

            em.flush();
            em.clear();

            chap05_MEMBER findMember = em.find(chap05_MEMBER.class, member.getId());
            List<chap05_MEMBER> members = findMember.getTeam().getMembers();

            for (chap05_MEMBER member1 : members) {
                System.out.println("member1 = " + member1.getName());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
