package touppercase.com;

public class MyTransformer {
	public String TransformContent(String body) {
		String upperCaseContent = body.toUpperCase();
		return upperCaseContent;
	}
}
