package playground;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class FlakeHttpClientTest {

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private HttpClientBuilder clientBuilder;

    @Before
    public void setup() throws Exception {
        String body = new JSONObject().put("status", 200).toString();
        StringEntity stringEntity = new StringEntity(body,"UTF-8");

        when(clientBuilder
                .setConnectionManager(any(HttpClientConnectionManager.class))
                .setDefaultRequestConfig(any(RequestConfig.class))
                .setDefaultHeaders(any(Collection.class))
                .build().execute(any(HttpUriRequest.class))
                .getEntity())
                .thenReturn(stringEntity);
    }

    @Test
    public void alwaysPass() {
        assertTrue(true);
    }
}

