package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    public UserRepository userRepository;
    @GetMapping()
    public List<User> getUsers() {
       return userRepository.findAll();
    }
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username) {
        return userRepository.findByUserName(username);
    }
    @DeleteMapping("/{id}")
    public static void delete(@PathVariable("id") Integer id) {
        UserRepository.deleteById(id);
    }
    @PostMapping()
    public void post(@RequestBody User user) {userRepository.save(user);}
    @PutMapping()
    public void put(@RequestBody User user) {
        userRepository.save(user);
    }

}
