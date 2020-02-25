package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "AKBB", targetNamespace = "http://AKBB")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WebServer {
    @WebMethod
    String getHello(String firstName, String secondName, String lastName);
}
