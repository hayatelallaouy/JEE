package ma.emsi.jpaemsi.service;

import ma.emsi.jpaemsi.entities.User;

import ma.emsi.jpaemsi.entities.Role;
public interface UserService   {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String rolename);
    void addRoleToUser(String username ,String rolename);
    User authenticate(String userName,String password );
}
