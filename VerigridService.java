package org.arpit.javapostsforlearning.webservice;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebServices
public interface HelloGlobe {

	@WebMethod public String sayHelloWorld(String name);
}

@WebEntServices
public interface IsAlive {

	@WebMethod public String sayHelloWorld(String name);
}

@WebService
public interface Stop {

	@WebMethod public String sayHelloWorld(String name);
}

@WebServices
public interface HelloWorld {

	@WebMethod public String sayHelloWorld(String name);
}
