package QueryDSLStudy.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/test")
    public ResponseEntity<List<UserCheckRequestDto>> signIn(UserSignUpRequestDto userRequestDto){
        log.info("user : " + userRequestDto.getUsername() + " pwd : " + userRequestDto.getPassword());
        userRequestDto.setUsername("chang");
        userRequestDto.setPassword("chang");
        return ResponseEntity.ok(userService.signIn(userRequestDto));
    }
}
