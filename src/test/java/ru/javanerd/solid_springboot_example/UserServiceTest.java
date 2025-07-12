package ru.javanerd.solid_springboot_example;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import ru.javanerd.solid_springboot_example.repository.entity.User;
import ru.javanerd.solid_springboot_example.service.UserService;

@SpringBootTest
@Transactional
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testRegisterUser() {
        User user = new User();
        user.setName("Test");
        user.setEmail("test@example.com");

        User saved = userService.registerUser(user);

        Assertions.assertNotNull(saved.getId());
        Assertions.assertEquals("Test", saved.getName());
    }
}
