package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myController {
	
//	@RequestMapping(value="/helloPage", method = RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage()
	{
		System.out.println("openHelloPage() method executed");
		
		ModelAndView mav=new ModelAndView("hello");
//		mav.setViewName("hello");
		return mav;
	}
	
	@GetMapping("/aboutUs")
	public String openAboutUsPage() {
		return "aboutUs";
	}
}
