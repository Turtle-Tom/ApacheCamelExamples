package touppercase.com;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyLogProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		System.out.println("Now procesing the String: " + exchange.getIn().getBody(String.class));
	}

}
