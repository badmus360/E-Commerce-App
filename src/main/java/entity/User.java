package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String email;
    private String password;
    private String name;
    private String phone;
    private String address;
    private boolean active;
    private String role = "ROLE_CUSTOMER";
    private Cart cart;

}
