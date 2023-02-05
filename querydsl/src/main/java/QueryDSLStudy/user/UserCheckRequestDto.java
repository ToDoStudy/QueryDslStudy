package QueryDSLStudy.user;


import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserCheckRequestDto {

    String username;
    String password;
    String addrees;
    String phone;


    @QueryProjection
    public UserCheckRequestDto(String username, String password, String addrees, String phone) {
        this.username = username;
        this.password = password;
        this.addrees = addrees;
        this.phone = phone;
    }
}
