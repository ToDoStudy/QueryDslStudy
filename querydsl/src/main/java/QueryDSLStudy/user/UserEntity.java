package QueryDSLStudy.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ?
    private Long userId;


    private String username;

    private String password;

    private String address;

    private String phone;

//    @Column(name = "Author")
//    private AuthorityUser author;

    @Builder
    public UserEntity(Long userId, String username, String password, String address, String phone) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
}
