package publisher;

import service.WebServerImpl;
import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/akbb", new WebServerImpl());
        System.out.println("start server");
    }
}
