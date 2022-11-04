package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if(user.getId() == null) {
            System.out.println("Save- Recebendo o usuário na camada de repositório.");
        } else {
            System.out.println("Update - recebendo o usuário na camada de repositório.");
        }
        System.out.println(user);
    }

    public static void deleteById(Integer id) {
        System.out.println("Delete/id - Recebendo o id %d para excluir um user");
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("List - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("sergio", "password"));
        users.add(new User("caue", "masterpass"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println("Find/id - Recebendo id: %d para localizar um user");
        return new User("Sergio", "password");
    }

    public User findByUserName(String username) {
        System.out.println("Find/username - Recebendo id: %d para localizar um user");
        return new User("sergio", "password");
    }
}
