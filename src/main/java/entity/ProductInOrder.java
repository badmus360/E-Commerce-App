package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class ProductInOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
    @ManyToOne
    private OrderMain orderMain;

    private String productId;

    private String productName;

    private String productDescription;

    private String productIcon;

    private Integer categoryType;

    private BigDecimal productPrice;

    private Integer productStock;

    private Integer count;


}
