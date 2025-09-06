// Post
//https://student-info-api.netlify.app/.netlify/functions/submit_student_info
// Get/Delete
// https://student-info-api.netlify.app/.netlify/functions/submit_student_info?UCID=12345678&section=101

public class Student {
    private String UCID;
    private String firstName;
    private String lastName;
    private String gitHubUserName;
    private String discordUserName;
    private String cartoon;
    private String programmingLanguage;
    private String movie;
    private String section;

    public Student() {}

    public Student(String UCID, String firstName, String lastName, String gitHubUserName,
                   String discordUserName, String cartoon, String programmingLanguage,
                   String movie, String section) {
        this.UCID = UCID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gitHubUserName = gitHubUserName;
        this.discordUserName = discordUserName;
        this.cartoon = cartoon;
        this.programmingLanguage = programmingLanguage;
        this.movie = movie;
        this.section = section;
    }

    public String getUCID() { return UCID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGitHubUserName() { return gitHubUserName; }
    public String getDiscordUserName() { return discordUserName; }
    public String getCartoon() { return cartoon; }
    public String getProgrammingLanguage() { return programmingLanguage; }
    public String getMovie() { return movie; }
    public String getSection() { return section; }

    @Override
    public String toString(){
        return String.format("{ \"UCID\": \"%s\", \"first_name\": \"%s\", \"last_name\": \"%s\", \"github_username\": \"%s\", \"discord_username\": \"%s\", \"favorite_cartoon\": \"%s\", \"favorite_language\": \"%s\", \"movie_or_game_or_book\": \"%s\", \"section\": \"%s\" }", UCID, firstName, lastName, gitHubUserName, discordUserName, cartoon, programmingLanguage, movie, section);
    }
}