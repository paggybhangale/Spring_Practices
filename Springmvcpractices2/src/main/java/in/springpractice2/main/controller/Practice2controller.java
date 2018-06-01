/** author -parag bhangale 1 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springpractice2.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *1 Jun 2018  in.springpractice2.man.controller Springmvcpractices2 TODO
 */
@RestController
public class Practice2controller {

	
	ModelAndView view=null;
	
	
	@RequestMapping(value="gotofirstpage.paggy")
	public ModelAndView getMyView()
	{
		view=new ModelAndView("welcomeJsp");
		view.addObject("Printthisinjsp","Welcome to 2nd exmaple of spring mvc");
		return view;
	}
	
	
	@RequestMapping(value="gotosecondpage.bhangale")
	public ModelAndView getSecondPageOnClick()
	{
		view=new ModelAndView("SecondPage");
		
		return view;
	}
	
	
}
