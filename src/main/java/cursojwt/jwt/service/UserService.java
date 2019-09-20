package cursojwt.jwt.service;



import cursojwt.jwt.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
