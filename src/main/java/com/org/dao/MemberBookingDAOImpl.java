package com.org.dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.org.model.CarVO;
import com.org.model.MemberVO;
 
import com.org.util.DBConnection;
 
 
 
public class MemberBookingDAOImpl implements MemberBookingDAO
{
   
    private static ResourceBundle rb= ResourceBundle.getBundle("database");
    private static Logger logger = LoggerFactory.getLogger(MemberBookingDAOImpl.class);
   
    public int addMember(MemberVO member) throws SQLException, ClassNotFoundException
    {
         String query= rb.getString("InsertQuery");
            logger.info("LoginQuery:"+query);
            Connection con= DBConnection.getDBConnectin();
            PreparedStatement st= con.prepareStatement(query);
            st.setString(1, member.getBookingId());
            st.setString(2, member.getMembberId());
            st.setString(3, member.getMembeName());
            st.setString(4,  member.getMembeContact());
             
             
            int result=  st.executeUpdate();
            System.out.println("insert result:"+result);
            return result;
           
    }
    public int addCarBooking(CarVO car)throws SQLException, ClassNotFoundException
    {
    	
    	 String query= rb.getString("InsertQuery");
         logger.info("LoginQuery:"+query);
         Connection con= DBConnection.getDBConnectin();
         PreparedStatement st= con.prepareStatement(query);
         st.setString(1, car.getBookingId());
         st.setString(2, car.getCarName());
         st.setString(3, car.getPickupDate());
         st.setString(4,  car.getReturnDate());
         st.setInt(5, car.getCarSeats());
         st.setFloat(6, car.getBookingPrice());
          
         int result=  st.executeUpdate();
         System.out.println("insert result:"+result);
         return result;
    	
    }
     
    public List<MemberVO>  getMemberBooking(String memberId)throws SQLException, ClassNotFoundException
    {
    	
    	String query= rb.getString("InsertQuery");
        logger.info("LoginQuery:"+query);
        Connection con= DBConnection.getDBConnectin();
        PreparedStatement st= con.prepareStatement(query);
        st.setString(1, memberId);
       List<MemberVO>  listMember = new ArrayList<MemberVO>();
        ResultSet  res= st.executeQuery();
        
              while(res.next())
              {
            	  MemberVO  obj = new MemberVO( );
                  obj.setBookingId(res.getString(1));;
                  obj.setMembberId(res.getString(2));
                  obj.setMembeContact(res.getString(3));
                  obj.setMembeName(res.getString(4));
                  listMember.add(obj);
              }
        
        return listMember;
         
    	
    	
    }
}