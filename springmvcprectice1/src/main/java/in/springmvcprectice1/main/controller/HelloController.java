/** author -parag bhangale 1 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcprectice1.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *1 Jun 2018  in.springmvcprectice1.main.controller springmvcprectice1 TODO
 */


//@controller we can use only controller but we want rest web services is next exmples hence we use @RestController
@RestController    //used for this class is a controlelr class and by default restful is implemented no extra configuration require
public class HelloController {

	
	
	@RequestMapping(value="/getfirstpageviamapping.html")  //use for mapping by default GET method is used for http request and responce
	public String getMeThisView()
	{

		return "FirstJsp";
	}
	
	
	
	@RequestMapping(value="/secondjsppage.html")
	public ModelAndView getModelAndViewObjectInReturn()
	{
		
		ModelAndView modelandview=new ModelAndView("SecondJsp");

		modelandview.addObject("message","Hi from ModelAndView returning method");
		
		return modelandview;
	}
	
	
	
	
	
	
	
}
