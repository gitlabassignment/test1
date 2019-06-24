package com.org.dao;
import java.sql.SQLException;
import java.util.List;
 import com.org.model.LoginVO;
 

public interface LoginDAO {
 
    boolean loginCheck(LoginVO  login  ) throws SQLException, ClassNotFoundException;
 
}    
 
 