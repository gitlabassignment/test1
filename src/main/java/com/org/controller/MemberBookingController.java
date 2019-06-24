package com.org.controller;
 
 
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
 
import org.slf4j.Logger;
 
import org.slf4j.LoggerFactory;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.org.model.CarVO;
import com.org.model.MemberVO;
 
import com.org.service.MemberBookingService;
import com.org.service.MemberBookingServiceImpl;
 
 
 
/**
* Servlet implementation class LoginController
*/
public class MemberBookingController extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
     
        
        Logger logger = LoggerFactory.getLogger(MemberBookingController.class);
             
 
        // the following statement is used to log any messages 
        logger.info("My first log"); 
 
        logger.info("welcome  ");
        RequestDispatcher dispatch= request.getRequestDispatcher("/memberReport.jsp");
           String param=request.getParameter("param");
          
           List<MemberVO>  memberList=null;
           MemberBookingService memberService = new MemberBookingServiceImpl();
             
              CarVO   car=new CarVO();
              MemberVO  member = new MemberVO();
           try
           {
              if(param.equals("car")) 
           {
             car.setBookingId(request.getParameter("bid"));
             car.setBookingPrice(Float.parseFloat(request.getParameter("cprice")));
             car.setCarName(request.getParameter("cname"));
             car.setCarSeats(Integer.parseInt(request.getParameter("cseat")));
             car.setPickupDate(request.getParameter("cpdate"));
             car.setReturnDate(request.getParameter("crdate"));
           memberService.addCarBooking(car);
           }
           
           if(param.equals("member"))
           {
        	   member.setBookingId(request.getParameter("mid"));
               member.setMembberId(request.getParameter("mname"));
            member.setMembeContact(request.getParameter("mcontacct"));
            member.setMembeName(request.getParameter("bid"));
            memberService.addMember(member);
            
           }
           if(param.equals("report"))
           {
        	   memberList = memberService.getMemberBooking(request.getParameter("mid"));
       request.setAttribute("memberList",memberList);          
           }
           
          
          }
          catch(SQLException e)
          {
              System.out.println("sql  exception"+e);
          }
          catch(ClassNotFoundException e1)
          {
              System.out.println("class not found exception"+e1);
          }
          
          
          logger.info("patient logging :");
           
           dispatch.forward(request, response);
        
 
}
}
 