/** author -parag bhangale 2 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcpractice4.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *2 Jun 2018  in.springmvcpractice4.main.controller springmvcpractice4 TODO
 */


@RestController
public class redirectionHandlerController {

	ModelAndView modelandview=null;
	
	
	@RequestMapping(value="aboutToGo/Index/redirectToLanding.clickme")
	public ModelAndView redirectMeToLandingPage()
	{
		modelandview=new ModelAndView("LandingPage");
		modelandview.addObject("pringmymsg", "welcome from controller");
		return modelandview;
	}
	
	
}
