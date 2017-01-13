package com.niit.cakenationbackend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.cakenationbackend.dao.CategoryDAO;
import com.niit.cakenationbackend.model.Category;





public class CategoryTest {

	@Autowired
	static Category category;
	@Autowired
	static CategoryDAO categoryDao;
	
	 static AnnotationConfigApplicationContext context;
	

	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.cakenationbackend");
		context.refresh();
	
		categoryDao=(CategoryDAO) context.getBean("categoryDao");
		category=(Category)context.getBean("category");
		System.out.println("ashaba");
		
	}

	@Test
	public void addCategoryTestCase()
	{
		
		category.setId("CG01");
		category.setName("BirthDay Cakes");
		category.setCategory_description("Chocotruffle-Cake");
	
	assertEquals("addcategorytestcase",categoryDao.save(category),true);

	}
	/*@Test
	public void deleteCategoryTestCase()
	{
		
		category.setCategory_id("CG01");
		category.setCategory_name("BirthDay Cakes");
		category.setCategory_description("Chocotruffle-Cake");
	categoryDao.delete(category);
	assertEquals("deleteCategoryTestCase",categoryDao.delete(category),true);

	}*/
	
	@Test
	public void listCategoryTestCase()
	{
		
		List<Category> listcategory=categoryDao.list();
		int rowcount=listcategory.size();
		assertEquals("listcategoryTestCase",rowcount,2);
		
		
	}
	
	@Test
	public void getCategoryTestCase()
	{
		
		category=categoryDao.get("CG01");
		
		assertEquals(category.getName(),"BirthDay Cakes");
		
		
	}
	

}
