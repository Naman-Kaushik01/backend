package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    static void main(String[] args) {
        Set<String> roles= new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MANAGER");

        for(String role:roles){
            System.out.println("Role : " + role);
        }

    }
}
