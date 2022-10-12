package edu.najah.eng.solid.lsp.example3;

public class App {


    public static void main(String[] args) {

        SuperAdmin user = new SuperAdmin();
        user.setId(1);
        user.setName("Ahmad");

        printSuperAdminInfo(user);


    }


    public static void printSuperAdminInfo(SuperAdmin user){
        System.out.println(user.getId());
        System.out.println(user.getName());
    }
}
