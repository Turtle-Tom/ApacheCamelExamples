package touppercase.com;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

	public static void main(String[] args) {
		MyRouteBuilder routeBuilder = new MyRouteBuilder();
		CamelContext context = new DefaultCamelContext();
		
		try {
			context.addRoutes(routeBuilder);
			context.start();
			Thread.sleep(5 * 1000);
			context.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
