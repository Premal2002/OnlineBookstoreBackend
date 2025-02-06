package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Book;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@SpringBootTest
class customerTestCases {
	
//	@Autowired
//	CustomerService customerService;
//	
//	static Customer customer;
//	
//	@BeforeAll
//	static void beforeAll() throws Exception{
//		customer = new Customer();
//		customer.setCustomer_address("Thane");
//		customer.setCustomer_contact("9876767656");
//		customer.setCustomer_name("Prem");
//		customer.setEmail("test@gmail.com");
//		customer.setPassword("test@123");
//	}
//	
//	@Disabled
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	void saveCustomer(){
//		assertNotNull(customerService.saveCustomer(customer));
//	}
//	
//	@Test
//	void loginCustomer(){
//		assertNotNull(customerService.saveCustomer(customer));
//	}
//	
//	@Test
//	void getAllCustomers(){
//		List<Customer> cList = customerService.getAllCustomers();
//		assertEquals(4, cList.size());
//	}
//	
//	@Test
//	void getCustomerById(){
//		Customer customer1 = customerService.getCustomerById(602);
//		assertEquals("Premal Kadam",customer1.getCustomer_name());
//	}
}
