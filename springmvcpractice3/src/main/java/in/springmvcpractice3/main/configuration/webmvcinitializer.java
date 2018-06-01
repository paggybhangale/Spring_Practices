/** author -parag bhangale 1 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcpractice3.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *1 Jun 2018  in.springmvcpractice3.main.configuration springmvcpractice3 TODO
 */

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan("in.springmvcpractice3.main")
@EnableWebMvc
public class webmvcinitializer extends WebMvcConfigurerAdapter
{

	
	
	@Bean
	public InternalResourceViewResolver getViewResolver()
	{
		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
		
		viewresolver
					.setPrefix("/WEB-INF/jspViews/");
		viewresolver
					.setSuffix(".jsp");
		
		return viewresolver;	
	}
	
	
	
	
	
	
}
