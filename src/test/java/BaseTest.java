import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    public static void setup() {

        RestAssured.baseURI = "https://ciclo-agil-api-test.vercel.app";
    }
}