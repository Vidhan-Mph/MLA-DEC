package com.test.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
	Customer customer=new Customer();
	
	customer.setId(rs.getInt("id"));
	customer.setC_name(rs.getString("c_name"));

	customer.setC_city(rs.getString("c_city"));
	customer.setC_state(rs.getString("c_state"));
return customer;

	}

}
