/** author -parag bhangale 1 Jun 2018
	bhangaleparags@gmail.com
 * 
 */
package in.springmvcpractice3.main.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author ${parag bhangale} parag bhangale
 *bhangaleparags@gmail.com
 *1 Jun 2018  in.springmvcpractice3.main.configuration springmvcpractice3 TODO
 */
public class webxmlinitializer extends AbstractAnnotationConfigDispatcherServletInitializer
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
		return new Class[] {webmvcinitializer.class};
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"*.paggy","*.bhangale","*.cdac"};
	}
	

}
