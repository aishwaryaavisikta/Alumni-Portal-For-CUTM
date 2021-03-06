

package com.alumni.registrationprofile;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alumni.profile.model.ProfileBean;
import com.alumni.profile.model.ProfileDB;
import com.alumni.registration.model.RegistrationProfileBean;
import com.alumni.registration.model.RegistrationProfileDB;

/**
 * Servlet implementation class RegistrationProfile
 */
@WebServlet("/RegistrationProfile")
public class RegistrationProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fn = request.getParameter("firstname");   
		String ln = request.getParameter("lastname");   
	    String scl = request.getParameter("school");
	    String clg = request.getParameter("college");    
	    String uni = request.getParameter("university");
	    String eid = request.getParameter("email");    
	    //String pic = request.getParameter("uploadphoto");
	    int bch = Integer.parseInt( request.getParameter("batch"));  
	    String br=request.getParameter("branch");
	    String phn = request.getParameter("phonenumber");
	    String add = request.getParameter("address");    
	    String cmpny = request.getParameter("companyname");
	    String cmadd = request.getParameter("companylocation");    
	    String pos = request.getParameter("position");
	    String ab = request.getParameter("about");
	    int userid = Integer.parseInt( request.getParameter("userid"));  
	    
 RegistrationProfileBean user=new RegistrationProfileBean();
	    
	   user.setAbout(ab);
	   user.setAddress(add);
	   user.setBatch(bch);
	   user.setBranch(br);
	   user.setCollege(clg);
	   user.setCompanylocation(cmadd);
	   user.setCompanyname(cmpny);
	   user.setPhonenumber(phn);
	   user.setPosition(pos);
	   user.setSchool(scl);
	   user.setUniversity(uni);
	   //user.setUploadphoto(pic);
	   user.setFirstname(fn);
	   user.setLastname(ln);
	   user.setEmail(eid);
	   
	  // HttpSession session = request.getSession(true);
	   //String email=(String)session.getAttribute("email"); 
	   /*int userid1 = (int) session.getAttribute("userid");*/
	    
	    RegistrationProfileDB reg=new RegistrationProfileDB();
	    reg.insertProfile(userid);
	    reg.registration(user,userid);
	    response.sendRedirect("Login.jsp");
	    
		
		// TODO Auto-generated method stub
	}

}
