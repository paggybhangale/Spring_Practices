/** author -parag bhangale 2 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcpractice4.main.controller;

import java.lang.invoke.MethodType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *2 Jun 2018  in.springmvcpractice4.main.controller springmvcpractice4 TODO
 */
@RestController
public class formHandlingController {

	
	@RequestMapping(value="aboutToGo/Index/formhandlewithurl.clickme",method=RequestMethod.POST)
	public ModelAndView handlethisform(@RequestParam("username") String username,@RequestParam("password") String password)
	{
		ModelAndView modelandview=new ModelAndView("Secondsuccesspage");
		modelandview
		            .addObject("printusername" ,username);
		modelandview
					.addObject("printpassword",password);
		
		return modelandview;
	}
	
	
}
