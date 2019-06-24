package com.org.dao;
 
import java.sql.SQLException;
import java.util.List;

import com.org.model.CarVO;
import com.org.model.MemberVO;
 
 
 
 
public interface MemberBookingDAO {
	 public int addMember(MemberVO member) throws SQLException, ClassNotFoundException ;
    public int addCarBooking(CarVO car)throws SQLException, ClassNotFoundException;
    public List<MemberVO>  getMemberBooking(String memberId)throws SQLException, ClassNotFoundException;
      
}