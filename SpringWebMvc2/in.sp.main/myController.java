package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;

//import jakarta.servlet.http.HttpServletRequest;

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
	
	@GetMapping("/myForm")
		public String openMyFormPage()
		{
			return "my-form";
		}
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(HttpServletRequest req)
//	{
//		String myName=req.getParameter("name1");
//		String myEmail=req.getParameter("email1");
//		String myPhone=req.getParameter("phone1");
//		System.out.println("name:"+myName);
//		System.out.println("name:"+myEmail);
//		System.out.println("name:"+myPhone);
//		
//		return "profile";
//	}
//	
	
	
	@PostMapping("/submitForm")
	public String handleMyForm(@ModelAttribute("model_user") User u)
	{
		
		
		return "profile";
	}
	
	
	
}
