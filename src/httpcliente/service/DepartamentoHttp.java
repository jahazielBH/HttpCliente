/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpcliente.service;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author jahaziel
 */
public class DepartamentoHttp {
    
    public String getAllDeptos() throws IOException  {
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpGet request = new HttpGet("http://localhost:5000/api/v1/crud/departamento");
            HttpResponse response = client.execute(request);
            int responseCode = response.getStatusLine().getStatusCode();
            System.out.println("**GET** request Url: " + request.getURI());
            System.out.println("Response Code: " + responseCode);
            System.out.println("Content:-\n");
            HttpEntity entity = response.getEntity();
            String json = EntityUtils.toString(entity);
            return json;
        } catch (ClientProtocolException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getDeptoById(String id) throws Exception {
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpGet request = new HttpGet("http://localhost:5000/api/v1/crud/departamento/" + id);
            HttpResponse response = client.execute(request);
            int responseCode = response.getStatusLine().getStatusCode();
            System.out.println("**GET** request Url: " + request.getURI());
            System.out.println("Response Code: " + responseCode);
            System.out.println("Content:-\n");
            HttpEntity entity = response.getEntity();
            String json = EntityUtils.toString(entity);
            return json;
        } catch (ClientProtocolException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addDepto(String depto) throws Exception {
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpPost post = new HttpPost("http://localhost:5000/api/v1/crud/departamento");
            post.addHeader("content-type", "application/json");
            StringEntity entity = new StringEntity(depto);
            post.setEntity(entity);
            HttpResponse response = client.execute(post);
            int responseCode = response.getStatusLine().getStatusCode();
            System.out.println("**POST** request Url: " + post.getURI());
            System.out.println("Response Code: " + responseCode);
            System.out.println("Content:-\n");
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateDepto(String depto) throws Exception {
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpPut put = new HttpPut("http://localhost:5000/api/v1/crud/departamento");
            put.addHeader("content-type", "application/json");
            StringEntity entity = new StringEntity(depto);
            put.setEntity(entity);
            HttpResponse response = client.execute(put);
            int responseCode = response.getStatusLine().getStatusCode();
            System.out.println("**PUT** request Url: " + put.getURI());
            System.out.println("Response Code: " + responseCode);
            System.out.println("Content:-\n");
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteDepto(String id) throws Exception {
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpDelete delete = new HttpDelete("http://localhost:5000/api/v1/crud/departamento/" + id);
            HttpResponse response = client.execute(delete);
            int responseCode = response.getStatusLine().getStatusCode();
            System.out.println("**DELETE** request Url: " + delete.getURI());
            System.out.println("Response Code: " + responseCode);
            System.out.println("Content:-\n");
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
