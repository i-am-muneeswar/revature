package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.revature.entity.RevatureUser;

public class RevatureDAO implements RevatureDAOInterface {

	public int createProfileDAO(RevatureUser ru) {
		
		int i = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			
			PreparedStatement ps = con.prepareStatement("insert into RevatureUser values(?,?,?,?)");
			ps.setString(1, ru.getName());
			ps.setString(2, ru.getPassword());
			ps.setString(3, ru.getEmail());
			ps.setString(4, ru.getAddress());
			
			i = ps.executeUpdate();
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
		
	}

	public RevatureUser viewProfileDAO(RevatureUser ru) {
		
		RevatureUser r = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			
			PreparedStatement ps = con.prepareStatement("select * from RevatureUser where email=?");
			ps.setString(1, ru.getEmail());
			
			ResultSet res = ps.executeQuery();
			
			if(res.next()) {
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				r = new RevatureUser();
				r.setName(n);
				r.setPassword(p);
				r.setEmail(e);
				r.setAddress(a);
			}
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

		return r;
	}

}
