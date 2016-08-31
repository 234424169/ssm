/**
 * Created by chen on 2016/8/29.
 */
import java.io.IOException;
import java.net.URISyntaxException;


import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class TestJson {

    @Test
    public void testJsonResponse() throws IOException, URISyntaxException {

        String url = "http://localhost:8080/ssm/test/testRequestBody";
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Accept", "application/json");
        requestHeaders.set("Content-Type", "application/json");

        String jsonStr = "{\"productcode\":\"YNG\",\"productname\":\"邮你购\"}";

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> httpEntity = new HttpEntity<String>(jsonStr, requestHeaders);
        String jsonData = restTemplate.postForObject(url, httpEntity, String.class);

        System.out.println(jsonData);
    }

    @Test
    public void testXmlResponse() throws IOException, URISyntaxException {

            String url = "http://localhost:8080/ssm/test/testRequestBody";
            HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.set("Accept", "application/xml");
            requestHeaders.set("Content-Type", "application/xml");

            String xmlStr = "<product><productcode>Jack</productcode><productname>16000</productname></product>";

            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<String> httpEntity = new HttpEntity<String>(xmlStr, requestHeaders);
            String xmlData = restTemplate.postForObject(url, httpEntity, String.class);

            System.out.println(xmlData);

    }
}
