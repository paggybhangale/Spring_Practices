/** author -parag bhangale 1 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcprectice1.main.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author parag bhangale
 *bhangaleparags@gmail.com
 *1 Jun 2018  in.springmvcprectice1.main.configurations springmvcprectice1 TODO
 */


@SuppressWarnings("deprecation")
@EnableWebMvc   //<mvc:annotation-driven/>
@Configuration//import org.springframework.context.annotation.Configuration;
@ComponentScan("in.springmvcprectice1.main")   // paste here a package path of your components          import org.springframework.context.annotation.ComponentScan;
public class springmvcinitializer extends WebMvcConfigurerAdapter
{

	
	
	/*this is the basic view resolver we used here 
	 * there are so many other view reolver for diffrent purpose
	 *        
	 *        
	 *        
	 *        
	 *        
	 *xmlViewResolver::-This implementation of ViewResolver accepts a configuration file written in XML with the same DTD as Spring’s XML bean factories:
				@Bean
				public ViewResolver xmlViewResolver() {
				    XmlViewResolver bean = new XmlViewResolver();
				    bean.setLocation(new ClassPathResource("views.xml"));
				    return bean;
				}
	 * 
	 * Below is the configuration file, views.xml:
		<beans xmlns="http://www.springframework.org/schema/beans"
		  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		  xsi:schemaLocation="http://www.springframework.org/schema/beans
		  http://www.springframework.org/schema/beans/spring-beans-4.2.xsd">
		  
		    <bean id="xmlConfig" class="org.springframework.web.servlet.view.JstlView">
		        <property name="url" value="/WEB-INF/view/xmlSample.jsp" />
		    </bean>
		  
		</beans>
	 * 
	 * 
	 * -----------------------------------------------------------------------------
	 * As the name of this resolver suggest a ResourceBundleViewResolver uses bean definitions in a ResourceBundle.
			
			First, we add the ResourceBundleViewResolver to the previous configuration:
			
			
			@Bean
			public ViewResolver resourceBundleViewResolver() {
			    ResourceBundleViewResolver bean = new ResourceBundleViewResolver();
			    bean.setBasename("views");
			    return bean;
			}
			The bundle is typically defined in a properties file, located in the classpath. Below is the views.properties file:
			
			
			sample.(class)=org.springframework.web.servlet.view.JstlView
			sample.url=/WEB-INF/view/sample.jsp
	 * 
	 * 
	 * */
	
	@Bean //this method is a bean method
	public InternalResourceViewResolver getViewResolver()
	{
		InternalResourceViewResolver viewresolver=new InternalResourceViewResolver();
		viewresolver
					.setPrefix("/WEB-INF/jspviews/");
		viewresolver
					.setSuffix(".jsp");
		
		return viewresolver;	
	}
	
	
	
	
	
	
}
