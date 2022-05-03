package model;

public class User {

    private String userEmail = "sol11.06.91@gmail.com";
    private String userPassword = "TMSonlAQA12Java";

    public User() {
    }

        public User(String userEmail, String userPassword){
            this.userEmail = userEmail;
            this.userPassword =userPassword;
        }
        public String getUserEmail() {
            return userEmail;
        }
        public void setUserEmail(String userEmail){
           this.userEmail=userEmail;
        }

        public String getUserPassword(){
            return userPassword;
        }
        public void getUserPassword (String userPassword){

        this.userPassword = userPassword;
        }
    }

