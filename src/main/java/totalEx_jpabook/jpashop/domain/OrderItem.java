package totalEx_jpabook.jpashop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    @JoinColumn(name = "ORDER_ID")
    @ManyToOne
    private Order order;

    private int orderPrice;
    private int count;
}
