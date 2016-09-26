package BantoPackage.resources;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class LoginAcceptanceTest {

    @Test
    public void testOne(){
        get("/hello-world").then().body("content", equalTo("Hello, nul!"));

    }

    @Test
    public void testTwo(){

        get("/hello-world?name=asshole").then().body("content", equalTo("Hello, asshole!"));
    }
 /*   @ClassRule
    public static final DropwizardAppRule<HelloWorldConfiguration> RULE =
            new DropwizardAppRule<HelloWorldConfiguration>(MyApp.class, resourceFilePath("my-app-config.yaml"));

    @Test
    public void loginHandlerRedirectsAfterPost() {
        Client client = new Client();

        ClientResponse response = client.resource(
                String.format("http://localhost:%d/login", RULE.getLocalPort()))
                .post(ClientResponse.class, loginForm());

        assertThat(response.getStatus()).isEqualTo(302);
    }   */
}

