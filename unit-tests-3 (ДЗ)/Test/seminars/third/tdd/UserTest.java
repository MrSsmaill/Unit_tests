package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    void userCreation() {
        User user = new User("user_0", "psw123");

        assertTrue(user.authenticate("user_0", "psw123"));
    }

    @Test
    void userCreationFail() {
        User user = new User("user_0", "psw123");

        assertFalse(user.authenticate("user_1", "psw123"));
    }

    @Test
    void userRepository() {
        UserRepository userRepository = new UserRepository();
        User user = new User("user_0", "psw123");

        user.authenticate("user_0", "psw123");
        userRepository.addUser(user);

        assertTrue(userRepository.findByName(user.name));
    }


    @Test
    void userRepositoryNotAuthenticate() {
        UserRepository userRepository = new UserRepository();
        User user = new User("user_0", "psw123");

        userRepository.addUser(user);

        assertFalse(userRepository.findByName(user.name));
    }
    @Test
    void testLogoutExceptForAdministrators(){
        UserRepository userRepository = new UserRepository();
        User user1 = new User("user_1", "psw123",false);
        User user2 = new User("admin", "psw123",true);
        User user3 = new User("user_3", "psw123",false);

        user1.authenticate("user_1", "psw123");
        user2.authenticate("admin", "psw123");
        user3.authenticate("user_3", "psw123");
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.logoutExceptForAdministrators();

        assertFalse(user1.isAuthenticate);
        assertTrue(user2.isAuthenticate);
        assertFalse(user3.isAuthenticate);
    }
}
