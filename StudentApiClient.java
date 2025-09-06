import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class StudentApiClient {
    private static final String BASE_URL = "https://student-info-api.netlify.app/.netlify/functions/submit_student_info";
    private final HttpClient client = HttpClient.newHttpClient();

    public void addStudent(String jsonBody) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("POST Response: " + response.body());
    }

    public void updateStudent(String jsonBody) throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(BASE_URL))
            .header("Content-Type", "application/json")
            .PUT(HttpRequest.BodyPublishers.ofString(jsonBody))
            .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("PUT Response: " + response.body());
}

    public void getStudent(String UCID, String section) throws Exception {
        String url = BASE_URL + "?UCID=" + UCID + "&section=" + section;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("GET Response: " + response.body());
    }

    public void deleteStudent(String UCID, String section) throws Exception {
        String url = BASE_URL + "?UCID=" + UCID + "&section=" + section;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .DELETE()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("DELETE Response: " + response.body());
    }
}
