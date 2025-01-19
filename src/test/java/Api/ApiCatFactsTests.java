package Api;

import TestData.DataProviderClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class ApiCatFactsTests {
    private static RequestSpecification httpRequest;
    private static Response response;

    @Test(dataProvider = "ApiCatfacts", dataProviderClass = DataProviderClass.class)
    public void requestCatFact(String cat, String amount) {
        httpRequest = RestAssured.given();
        response = httpRequest.get("https://cat-fact.herokuapp.com/facts/random?animal_type=cat" + cat + "&" + "amount" + "=" + amount);
        assertFalse(response.getBody().toString().isEmpty());

    }


}
