package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       if(user.isAuthenticate){
           this.data.add(user);
       }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutExceptForAdministrators() {
        for(int i = 0; i < this.data.size(); ++i) {
            if (!this.data.get(i).isAdmin) {
                (this.data.get(i)).isAuthenticate = false;
            }
        }
    }

    public static void main(String[] args) {
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

        System.out.println(!userRepository.data.get(0).isAdmin);
    }

}