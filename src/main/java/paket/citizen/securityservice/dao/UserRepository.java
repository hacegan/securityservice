package paket.citizen.securityservice.dao;

import org.springframework.data.repository.Repository;
import paket.citizen.securityservice.model.UsersEntity;

import java.util.List;

public interface UserRepository extends Repository<UsersEntity, String> {

    UsersEntity findByPhoneNo(String phoneNo);
}
