package com.cg.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.customer.dao.ICustomerDAO;
import com.cg.customer.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerDAO dao;

	@Override
	public void addDetails(Customer bean) {
		dao.addDetails(bean);
		
	}

	@Override
	public void check(Customer bean) {
		// TODO Auto-generated method stub
		if(bean.getComplainCategory().equalsIgnoreCase("Internet Banking"))
		{
			bean.setPriority("High");
		    bean.setStatus("Open");
		}
		else if(bean.getComplainCategory().equalsIgnoreCase("General Banking"))
		{
			bean.setPriority("Medium");
		    bean.setStatus("Open");
		}
		else
		{
			bean.setPriority("Low");
		    bean.setStatus("Open");
		}
		
	}

	@Override
	public Customer find(int complainid) {
		// TODO Auto-generated method stub
		return dao.find(complainid);
	}

}
