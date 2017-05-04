package api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.impress.firstTest.App;

@RestController
public class HelloController {
	
	private App app = new App();
	
	@RequestMapping("/account")
	public String index() {
		return app.getData().toString();
	}
	
	
	@RequestMapping(method=RequestMethod.POST,path="/account/{age}")
	public String postData(@PathVariable("age") String age) {
		 app.createEntity(age);
		 return "200";
	}


}