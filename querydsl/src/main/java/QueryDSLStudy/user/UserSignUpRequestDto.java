package QueryDSLStudy.user;


import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;


@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class UserSignUpRequestDto {

    private String username;
    private String password;


    public UserEntity toUser(PasswordEncoder encoder){

        return UserEntity.builder()
                .username(username)
                .password(password)
                .build();

        //                 .password(encoder.encode(userpassword))
    }

}
