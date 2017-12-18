package com.app.springassignment.contrl;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller

public class Orderslist {

	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping("/orders")
	public ModelAndView orders() {
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Orders");
		List<com.app.springassignment.entity.Orders>orders = query.list();
		
		ModelAndView modelAndView = new ModelAndView("ordersListView");
		modelAndView.addObject("orders",orders);
		return modelAndView;
		
	}
	
}
