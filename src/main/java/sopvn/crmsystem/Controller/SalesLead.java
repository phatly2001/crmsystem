package sopvn.crmsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalesLead {

	@RequestMapping("lead")
	public String Index() {
		return "sales-lead";
	}
}
