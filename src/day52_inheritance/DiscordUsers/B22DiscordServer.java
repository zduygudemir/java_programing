package day52_inheritance.DiscordUsers;

import day52_inheritance.Admin;

public class B22DiscordServer {
    public static void main(String [] args){
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Suleyman");
        user1.setRole("Student");

        Admin admin1 = new Admin();
        admin1.setId(43145);
        admin1.setName("Burak kara");
        admin1.setRole("Student");

    }
}
