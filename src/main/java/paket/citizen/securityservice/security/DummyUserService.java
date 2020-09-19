package paket.citizen.securityservice.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import paket.citizen.securityservice.dao.UserRepository;
import paket.citizen.securityservice.model.UsersEntity;

@Service
public class DummyUserService {

    @Autowired
    UserRepository userRepository;

    public UserDetails getUserByUsername(String username) {
        UsersEntity usersEntity = userRepository.findByPhoneNo(username);
        if (usersEntity != null) {
            return User.withUsername(usersEntity.getPhoneNo()).password(new BCryptPasswordEncoder().encode(usersEntity.getPassword())).roles("USER").build();
        } else throw new UsernameNotFoundException("User not found by name: " + username);
    }
}
