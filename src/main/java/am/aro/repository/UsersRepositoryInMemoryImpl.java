package am.aro.repository;

import am.aro.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {

    private List<User> users;

    public UsersRepositoryInMemoryImpl() {
        this.users = new ArrayList<>();


        User user1 = new User("Aro", "password1", LocalDate.parse("1994-02-02"));
        User user2 = new User("Ani", "password2", LocalDate.parse("1994-02-02"));
        User user3 = new User("Naro", "password3", LocalDate.parse("1994-02-02"));
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public List<User> findAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}