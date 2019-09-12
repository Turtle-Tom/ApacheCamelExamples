package camelpractice.com.routes;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:C:/input_folder?noop=true").to("file:C:/output_folder");
		// Note: noop=true keeps current directory as input_folder instead of changing to
		// output_folder during transfer.
	}

}
