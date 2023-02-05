package QueryDSLStudy.user;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;


    // 회원가입
//    public UserResponseDto signup(UserSignUpRequestDto userRequestDto){
//
//    }


    // 로그인
    public List<UserCheckRequestDto> signIn(UserSignUpRequestDto userRequestDto){
        return userRepository.findUserInformation(userRequestDto);
    }
}
