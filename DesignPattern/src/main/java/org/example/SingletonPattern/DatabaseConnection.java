package org.example.SingletonPattern;

public class DatabaseConnection {

    private static DatabaseConnection connection;

    private String username;
    private String password;
    private String url;

    private DatabaseConnection(){
        System.out.println("first time call");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static DatabaseConnection getConnection(){
        if(connection==null){
            connection= new DatabaseConnection();

        }
        System.out.println("calling same instance");
        return  connection;
    }

    @Override
    public String toString() {
        return "org.example.SingletonPattern.DatabaseConnection{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public static void main(String[] args) {





    }
}
