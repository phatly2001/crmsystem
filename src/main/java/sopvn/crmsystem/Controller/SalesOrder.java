package sopvn.crmsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalesOrder {
	@RequestMapping("/order")
	public String Index() {
		return "sales-order";
	}
}
