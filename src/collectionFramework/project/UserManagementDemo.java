package collectionFramework.project;

import java.util.*;

public class UserManagementDemo {
    static void main(String[] args) {
        Set<String> user1Roles = new HashSet<String>(Arrays.asList("admin", "user"));
        User user1 = new User("Alice" ,true, user1Roles);

        List<User> users = new ArrayList<User>();
        users.add(user1);

        users.add(new User("Bob", false,
                new HashSet<>(Arrays.asList("user"))));

        users.add(new User("Bob", true,
                new HashSet<>(Arrays.asList("manager"))));

        //REMOVE INACTIVE USERS

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if(!iterator.next().isActive()){
                iterator.remove();
            }
            System.out.println("ACTIVE USERS");
            for(User u : users){
                System.out.println(u.getName());
            }
        }
        //COUNT USERS PER ROLE

        Map<String,Integer> roleCount = new HashMap<>();
        for(User u : users){
            for(String role : u.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }
        }

        System.out.println("Role count");
        for(Map.Entry<String,Integer> entry : roleCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
