package com.cg.customer.service;

import com.cg.customer.model.Customer;

public interface ICustomerService {

	void addDetails(Customer bean);

	void check(Customer bean);

	Customer find(int complainid);

}
