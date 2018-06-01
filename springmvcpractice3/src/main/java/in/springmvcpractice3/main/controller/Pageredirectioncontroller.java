/** author -parag bhangale 1 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcpractice3.main.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *1 Jun 2018  in.springmvcpractice3.main.controller springmvcpractice3 TODO
 */


@RestController
public class Pageredirectioncontroller {

	ModelAndView modelandview=null;
	
	
	/*
	 * if i simply put curly bracktes to any mapping then we can send it by any name line
	 * 	@RequestMapping(value="index/{welcomepage}/redirectmetoDummyIndex.paggy")
	 *     //index/paggy/redirectmetoDummyIndex.paggy
	 *     //index/bhangale/redirectmetoDummyIndex.paggy
	 *    //index/zdfsdfg/redirectmetoDummyIndex.paggy
	 * it will invoke a same method as down
	 * 
	 * */
	@RequestMapping(value="index/{welcomepage}/redirectmetoDummyIndex.paggy")
	public ModelAndView getMyIndexPage()
	{
	    modelandview=new ModelAndView("FirstJsp");
	    modelandview.addObject("printthis","Spring exmaple number 3");
		return modelandview;
	}
	
	
	
	/*
	 * when we use path variable we just use @PathVariable annotation with string iamfromcdacVar as argument in method
	 * 
	 * if we hit the url acts/hyderabad/{paggybhangale}.cdac  then that paggybhnagale is taken to the String iamfromcdacVar
	 * 
	 * and we will print that object
	 * */
	@RequestMapping("acts/hyderabad/{iamfromcdac}.cdac")
	public ModelAndView getSecondView(@PathVariable("iamfromcdac") String iamfromcdacVar)
	{
		modelandview=new ModelAndView("Secondjsp");
		
		modelandview.addObject("msg",iamfromcdacVar);
		return modelandview;
	}
	
	
	
}
