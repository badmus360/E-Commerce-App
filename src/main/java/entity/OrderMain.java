package entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@DynamicUpdate
public class OrderMain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany
    private Set<ProductInOrder> product = new HashSet<>();

    private String buyerEmail;

    private String buyerName;

    private String buyerAddress;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
