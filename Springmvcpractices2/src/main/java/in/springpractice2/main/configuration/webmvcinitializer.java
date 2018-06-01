/** author -parag bhangale 1 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springpractice2.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *1 Jun 2018  in.springpractice2.main.configuration Springmvcpractices2 TODO
 */

@SuppressWarnings("deprecation")
@EnableWebMvc
@Configuration
@ComponentScan("in.springpractice2.main")
public class webmvcinitializer extends WebMvcConfigurerAdapter
{

	@Bean
    public InternalResourceViewResolver getViewResolver()
	{
		
		InternalResourceViewResolver viewresolve=new InternalResourceViewResolver();
		viewresolve	
					.setPrefix("/WEB-INF/views/");
		viewresolve
					.setSuffix(".jsp");
		
		return viewresolve;
	}
	
	
	
}
