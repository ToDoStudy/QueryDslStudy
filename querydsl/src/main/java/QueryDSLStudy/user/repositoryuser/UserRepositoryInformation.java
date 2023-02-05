package QueryDSLStudy.user.repositoryuser;

import QueryDSLStudy.user.UserCheckRequestDto;
import QueryDSLStudy.user.UserSignUpRequestDto;

import java.util.List;

public interface UserRepositoryInformation {
    List<UserCheckRequestDto> findUserInformation(UserSignUpRequestDto userRequestDto);
}
