package sopvn.crmsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CusFaq {

	@RequestMapping("faq")
	public String Index() {
		return "cus-faq";
	}
}
