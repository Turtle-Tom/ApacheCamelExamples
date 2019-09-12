package touppercase.com;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:C:/input?move=./done")
		.process(new MyLogProcessor())
		.bean(new MyTransformer(), "TransformContent")
		.to("file:C:/output");
	}

}
