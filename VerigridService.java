package org.arpit.javapostsforlearning.webservice;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IsAlive {

	@WebMethod public String sayHelloWorld(String name);
}

@WebService
public interface HelloWorld {

	@WebMethod public String sayHelloWorld(String name);
}

