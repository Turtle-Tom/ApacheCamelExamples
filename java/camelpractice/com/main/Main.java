package camelpractice.com.main;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import camelpractice.com.routes.SimpleRouteBuilder;

public class Main {
	public static void main(String[] args) {
		SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
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
