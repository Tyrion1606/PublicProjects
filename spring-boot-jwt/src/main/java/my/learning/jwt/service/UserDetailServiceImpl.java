package my.learning.jwt.service;

import my.learning.jwt.data.UserData;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final BCryptPasswordEncoder encoder; // declara a classe que "encoda" a senha

    // CONSTRUCTOR
    public UserDetailServiceImpl(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.encoder = bCryptPasswordEncoder;
    }

    // CLASS METHODS
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserData user = findUser(userName);
        if (user == null) {
            throw new UsernameNotFoundException(userName);
        }
        return new User(user.getUserName(), user.getPassword(), Collections.emptyList());
    }

    private UserData findUser(String userName) {
        UserData user = new UserData("admin", encoder.encode("admin")); // criando um usuário na mão só pra teste
        return user;
    }

    public List<UserData> listUsers(){
        ArrayList<UserData> list = new ArrayList<>();
        list.add(findUser("admin"));
        return list;
    }
}
