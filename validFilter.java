package advanced.java.program;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/validFilter")
public class validFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	String Name = request.getParameter("Name");
    String age=request.getParameter("Age");
    int Age=Integer.parseInt(age);
    if( Name=="admin"  && Age==30){
    	response.getWriter().write("passing through validate filter to check name and age");
        chain.doFilter(request, response);
     }else           
    response.getWriter().write("blocked by validateFilter as there is no Name and age ");
}

public void init(FilterConfig fConfig) throws ServletException {

}

@Override
public boolean accept(Object entry) throws IOException {
	// TODO Auto-generated method stub
	return false;
}

	
}
