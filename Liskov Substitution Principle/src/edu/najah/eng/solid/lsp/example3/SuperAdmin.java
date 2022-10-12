package edu.najah.eng.solid.lsp.example3;

import java.util.List;

public class SuperAdmin extends  AdminUser{
    private List<AdminUser> adminUsers;

    public List<AdminUser> getAdminUsers() {
        return adminUsers;
    }

    public void setAdminUsers(List<AdminUser> adminUsers) {
        this.adminUsers = adminUsers;
    }
}
