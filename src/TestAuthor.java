public class TestAuthor {
    public void Test()
    {
        System.out.println("Creating Joanne Roaling");
        Author joanne = new Author("Joanne Roaling", "harrypotter@email.ru", 'f');
        System.out.print("Created author: ");
        System.out.println(joanne.toString());
        System.out.print("Name: ");
        System.out.println(joanne.getName());
        System.out.print("Email: ");
        System.out.println(joanne.getEmail());
        System.out.println("Changing email");
        joanne.setEmail("joanne@email.ru");
        System.out.print("Email: ");
        System.out.println(joanne.getEmail());
        System.out.print("Gender: ");
        System.out.println(joanne.getGender());
    }
}
