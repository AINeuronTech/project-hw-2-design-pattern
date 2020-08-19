package design.pattern.builder.pattern;

/*
  Below is the User class that have some private fields/attributes.
  Please implement Builder Design Pattern.
 */
public class User {
    private final String userName;
    private final String userEmail;
    private final String userSSN;
    private final int userAge;

    public User(UserBuilder userBuilder){
        this.userName = userBuilder.userName;
        this.userEmail = userBuilder.userEmail;
        this.userSSN = userBuilder.userSSN;
        this.userAge = userBuilder.userAge;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserSSN() {
        return userSSN;
    }

    public int getUserAge() {
        return userAge;
    }


    public static class UserBuilder {
        private final String userName;
        private final String userEmail;
        private final String userSSN;
        private final int userAge;

        public UserBuilder(String userName, String userEmail, String userSSN, int userAge) {
            this.userName = userName;
            this.userEmail = userEmail;
            this.userSSN = userSSN;
            this.userAge = userAge;
        }
    }
}
