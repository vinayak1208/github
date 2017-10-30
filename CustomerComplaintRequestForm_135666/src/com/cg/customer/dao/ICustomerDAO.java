package com.cg.customer.dao;

import com.cg.customer.model.Customer;

public interface ICustomerDAO {

	void addDetails(Customer bean);

	Customer find(int complainid);

}
