package com.org.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.org.dao.MemberBookingDAO;
import com.org.dao.MemberBookingDAOImpl;
import com.org.model.CarVO;
import com.org.model.MemberVO;
 

 
 
 
 
 
public class MemberBookingServiceImpl implements MemberBookingService
{
 
    static MemberBookingDAO  memberDao;
    public static MemberBookingDAO getCustomerDAO( ) {
        
        if(memberDao==null)
        {
        	memberDao = new MemberBookingDAOImpl();
        }
        return memberDao;
    }
	public int addMember(MemberVO member) throws SQLException, ClassNotFoundException {
		 
		return memberDao.addMember(member);
	}
	public int addCarBooking(CarVO car) throws SQLException, ClassNotFoundException {
		return memberDao.addCarBooking(car);
	}
	public List<MemberVO> getMemberBooking(String memberId) throws SQLException, ClassNotFoundException {
		 
		return memberDao.getMemberBooking(memberId);
		
	}
	 
   
   
}