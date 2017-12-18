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
public class Products {
	@Autowired
	private SessionFactory sessionFactory;
	@RequestMapping("/Productslist")
	public ModelAndView Productslist()
	{
	Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Products");
	
		//Query query = session.createQuery("select p from Products p where p.productCode = ?");
		//query.setParameter(0, )
		List<Products> products = query.list();
		
		ModelAndView modelAndView = new ModelAndView("productsView");
		
		modelAndView.addObject("products", products);
		
		return modelAndView;
		
	}

}
