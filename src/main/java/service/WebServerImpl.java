package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.WebServer")
public class WebServerImpl implements WebServer{

    @Override
    public String getHello(String firstName, String secondName, String lastName) {
        return "Чистый доход по клиенту "+firstName+" "+secondName+" "+lastName+" составляет 5000 рублей";
    }
}
