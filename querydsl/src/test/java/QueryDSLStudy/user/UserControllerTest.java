package QueryDSLStudy.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
class UserControllerTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void userTest(){
        // INSERT INTO USER values(2L, 'busan', '1234', '010-1111-1111', 'leekyougnchang');

        // 유저 정보 삽입
        UserEntity user = new UserEntity(2L, "busan", "1234", "010-1111-1111", "leekyougnchang");
        userRepository.save(user);

        // Impl 테스트



    }
}