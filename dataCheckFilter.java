package advanced.java.program;

 import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter; 

@WebFilter("/dataCheckFilter")
public class dataCheckFilter implements Filter {
 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
         String Name = request.getParameter("Name");
         String Age=request.getParameter("Age");
         if( Name != null && Age!=null){
         	response.getWriter().write("passing through datacheckFilter...............");
             chain.doFilter(request, response);
            }
        else           
         response.getWriter().write("blocked by datacheckFilter as there is no Name and age ");
 }

 public void init(FilterConfig fConfig) throws ServletException {
    
 }
 
 public void destroy() {
     
 }

@Override
public boolean accept(Object entry) throws IOException {
	// TODO Auto-generated method stub
	return false;
}

}
