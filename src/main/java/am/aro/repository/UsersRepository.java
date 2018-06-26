package am.aro.repository;

import am.aro.model.User;

import java.util.List;

public interface UsersRepository {
    List<User> findAll();
    void save(User user);
}
