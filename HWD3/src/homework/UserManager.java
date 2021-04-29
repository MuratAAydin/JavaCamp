package homework;

public class UserManager {

    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcı sisteme eklendi! ");
        System.out.println();
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            add(user);
        }
    }

    public void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanıcının bilgisi güncellendi!");
        System.out.println();
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " kullanıcı sistemden silindi!");
        System.out.println();
    }

    public void logout(User user) {
        System.out.println(user.getFirstName() + " kullanıcı sistemden çıkış yaptı!");
        System.out.println();
    }

    public void login(User user) {
        System.out.println(user.getFirstName() + " kullanıcı sisteme giriş yaptı!");
        System.out.println();
    }

    public void getAllUsers(User user) {
        System.out.println("Sistemde ki bütün kullanıcıların listesi!");
        System.out.println();
    }

    public void getUserById(User user) {
        System.out.println("Spesifik bir kullanıcının bilgileri!");
        System.out.println();
    }

}
