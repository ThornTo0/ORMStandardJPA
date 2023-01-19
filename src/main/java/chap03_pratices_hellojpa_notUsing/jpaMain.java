//package pratices_hellojpa_notUsing;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class jpaMain {
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin(); // 데이터베이스 트랜잭션 시작!
//
//        /* Code 부분*/
//
//        /* 등록 코드 */
////        try {
////            Member member = new Member();
////
////            member.setId(4L);
////            member.setName("HelloD");
////
////            em.persist(member);
////
////            tx.commit();
////
////        } catch (Exception e) {
////            tx.rollback();
////        } finally {
////            em.close();
////
////        }
//
//        /* 조회 코드 */
////        try {
////
////            Member findMember = em.find(Member.class, 1L);
////
////            // 삭제
//////            em.remove(1L);
////
////            // 수정
//////            findMember.setName("HelloJPA");
////
////            System.out.println("findMember.getId() = " + findMember.getId());
////            System.out.println("findMember.getName() = " + findMember.getName());
////
////        } catch (Exception e) {
////            tx.rollback();
////        } finally {
////            em.close();
////
////        }
//
//        // 플러시
////        try {
////
////            Member member = new Member();
////            member.setId(4L);
////            member.setUsername("D");
////            member.setRoleType(RoleType.GUEST);
////
////            em.persist(member);
////            tx.commit();
////        } catch (Exception e) {
////            tx.rollback();
////        } finally {
////            em.close();
////
////        }
////
////        emf.close();
//
//        // ID 자동 생성
//        try {
//
//            Member_PrimaryMapping member = new Member_PrimaryMapping();
////            member.setId("ID_A");
//            member.setUsername("C");
//
//            em.persist(member);
//            tx.commit();
//        } catch (Exception e) {
//            tx.rollback();
//        } finally {
//            em.close();
//
//        }
//
//        emf.close();
//
//    }
//
//
//
//
//}
