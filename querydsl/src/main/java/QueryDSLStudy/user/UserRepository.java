package QueryDSLStudy.user;

import QueryDSLStudy.user.repositoryuser.UserRepositoryInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>, UserRepositoryInformation {

}
