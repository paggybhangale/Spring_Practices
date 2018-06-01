/** author -parag bhangale 1 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcprectice1.main.configurations;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *1 Jun 2018  in.springmvcprectice1.main.configurations springmvcprectice1 TODO
 */
public class springxmlinitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {springmvcinitializer.class};
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"*.html"};
	}
	
	

}
