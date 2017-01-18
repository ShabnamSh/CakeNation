package com.niit.cakenation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.cakenationbackend.dao.CartDAO;
import com.niit.cakenationbackend.dao.CategoryDAO;
import com.niit.cakenationbackend.dao.ProductDAO;
import com.niit.cakenationbackend.model.Cart;
import com.niit.cakenationbackend.model.Category;
import com.niit.cakenationbackend.model.Product;

@Controller
public class CartController {
	@Autowired(required=true)
	private CartDAO cartDao;
	
	@Autowired(required=true)
	private ProductDAO productDao;
	
	@Autowired(required=true)
	private CategoryDAO categoryDao;
	
	@RequestMapping(value = "/myCart", method = RequestMethod.GET)
	public String myCart(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("categorylist", categoryDao.list());
	
		model.addAttribute("cart", new Cart());
		model.addAttribute("cartlist", this.cartDao.list());
		model.addAttribute("totalAmount", cartDao.getTotalAmount("user")); // Just to test, passwrdo user
		model.addAttribute("displayCart", "true");
		return "/home";
	}
	@RequestMapping("/addtocart")	
	public String getCart(HttpSession session,ModelMap model){
		
	Product product=(Product)session.getAttribute("selectedproduct");
	model.addAttribute("selectedproduct",product);
		return "Cart";
	}
}
