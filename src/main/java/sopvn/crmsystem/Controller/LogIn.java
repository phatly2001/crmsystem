package sopvn.crmsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogIn {
	
	@RequestMapping("Login")
	public String Index() {
		return "Login";
	}
}
