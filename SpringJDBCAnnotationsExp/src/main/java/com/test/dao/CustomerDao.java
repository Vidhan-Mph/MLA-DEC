package com.test.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.test.model.Customer;
import com.test.model.CustomerMapper;



@Component
public class CustomerDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public CustomerDao(DataSource dataSource)
	{
		jdbcTemplate=new JdbcTemplate(dataSource);
	}

	public boolean createCustomer(Customer customer)
	{
		String sql="insert into customer(c_name,c_city,c_state) values(?,?,?)";
		
		return jdbcTemplate.update(sql,customer.getC_name(),customer.getC_city(),customer.getC_state())>0;
	}
	public boolean updateCustomer(Customer customer)
	{
		String sql="update customer set c_name=?,c_city=?,c_state=? where id=?";
		
		return jdbcTemplate.update(sql,customer.getC_name(),customer.getC_city(),customer.getC_state(),customer.getId())>0;
	}
	public List<Customer> getAllCustomers()
	{
		String sql="select * from customer";
		return jdbcTemplate.query(sql,new CustomerMapper());
	}
	public boolean deleteCustomer(Customer customer) {
		
	String sql="delete from customer where id=?";
		return jdbcTemplate.update(sql, customer.getId())>0;
	}
}
