public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + " - " + gender + " - " + email;
    }
}