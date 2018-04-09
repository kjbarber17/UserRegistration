package edu.dmacc.spring.userregistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class UserController {

	@Autowired UserDao dao;
	private static final String[] countries = { "France","United States","Germany","England"};

	@RequestMapping(value="/form")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("userForm");
		modelAndView.addObject("user",new User());
		modelAndView.addObject("countries",countries);

		return modelAndView;
	}
	@RequestMapping(value = "/result")
	public ModelAndView processUser(User user) {
		System.out.println("In ProcessUser");
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Value in getName" + user.getName());
		dao.insertUser(user);
		modelAndView.setViewName("userResult");
		modelAndView.addObject("u",user);
		return modelAndView;
	}
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<User> allUsers = dao.getAllUsers();
		modelAndView.setViewName("viewAllUsers");
		modelAndView.addObject("all",allUsers);
		return modelAndView;
	}
	@Bean
	public UserDao dao() {
		UserDao bean = new UserDao();
		return bean;
	} 
}