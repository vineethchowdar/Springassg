package com.app.springassignment.contrl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.springassignment.entity.cmpositekeys;
import com.app.springassignment.entity.Orders;
import com.app.springassignment.entity.Products;

@Controller
public class Order {

	@Autowired
	private SessionFactory sessionFactory;
	@RequestMapping("/RequestOrders")
	public ModelAndView RequestOrders(HttpServletRequest request)
	{
		
		Session session = sessionFactory.openSession();
		
		Products products = new Products();
		products.setProductCode(request.getParameter("productCode"));
		Orders orders = new Orders();
		
		cmpositekeys composite = new cmpositekeys();
		composite.setOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
		composite.setProductCode(request.getParameter("productCode"));
		Query query = session.createQuery("select o from Orderdetails o where o.orderId.orderNumber = ? and  o.orderId.productCode = ?");
		
		query.setParameter(0, composite.getOrderNumber());
		query.setParameter(1, composite.getProductCode());
		Query query1 = session.createQuery("select p from Products p where p.productCode = ?");
		query1.setParameter(0, products.getProductCode());
		List<Orders> Orders = query.list();
		List<Products> productList = query1.list();
		ModelAndView modelAndView = new ModelAndView("ordersView");
		if(Orders.isEmpty())
		{
			modelAndView = new ModelAndView("failure");
		}
		else
		{
			modelAndView.addObject("orders", orders);
			modelAndView.addObject("products",productList);
			
		}
		
		return modelAndView;
		
		
	}
}
