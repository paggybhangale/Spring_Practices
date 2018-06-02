/** author -parag bhangale 2 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcpractice4.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *2 Jun 2018  in.springmvcpractice4.main.controller springmvcpractice4 TODO
 */
@SuppressWarnings("deprecation")
@Controller
@EnableWebMvc
@ComponentScan("in.springmvcpractice4.main")
public class webMVCinitializer extends WebMvcConfigurerAdapter{
	
	
	
	@Bean
	public InternalResourceViewResolver getViewResolver()
	{
		final String prefix="/WEB-INF/views/";
		final String suffix=".jsp";
		
		
		InternalResourceViewResolver viewresolve=new InternalResourceViewResolver();
		viewresolve
				.setPrefix(prefix);
		viewresolve
				.setSuffix(suffix);;
		
				return viewresolve;
	}
	
	
	
	

}
