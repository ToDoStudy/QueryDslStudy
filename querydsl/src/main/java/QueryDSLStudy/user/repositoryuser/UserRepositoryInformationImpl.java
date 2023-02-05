package QueryDSLStudy.user.repositoryuser;

import QueryDSLStudy.user.QUserCheckRequestDto;
import QueryDSLStudy.user.UserCheckRequestDto;
import QueryDSLStudy.user.UserSignUpRequestDto;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.util.List;

import static QueryDSLStudy.user.QUserEntity.userEntity;



public class UserRepositoryInformationImpl implements UserRepositoryInformation {

    private final JPAQueryFactory jpaQueryFactory;

    public UserRepositoryInformationImpl(EntityManager em) {
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<UserCheckRequestDto> findUserInformation(UserSignUpRequestDto userRequestDto) {

        return jpaQueryFactory
                .select(new QUserCheckRequestDto(
                        userEntity.username.as("username"),
                        userEntity.password.as("password"),
                        userEntity.address.as("address"),
                        userEntity.phone.as("phone")))
                .from(userEntity)
                .where(
                        userEntity.username.eq(userRequestDto.getUsername()),
                        userEntity.password.eq(userRequestDto.getPassword())
                ).fetch();


    }
}
