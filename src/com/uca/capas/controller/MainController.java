package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;
import com.uca.capas.domain.User;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView initProduct() {
		ModelAndView mav = new ModelAndView();
		Product product = new Product();
		mav.addObject("message", "Ingresar los datos del producto");
		mav.addObject("product", product);
		mav.setViewName("productForm");
		return mav;
	}
	
	@RequestMapping("/formProduct")
	@ResponseBody
	public ModelAndView productForm(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.addObject("message", "Hubo un error al momento de agregar un producto");
			mav.setViewName("productForm");
		}
		else {
			mav.addObject("message", "Producto agregado correctamente");
			mav.setViewName("form");
		}
		return mav;
	}
	
	@RequestMapping("/User")
	public ModelAndView initUser() {
		ModelAndView mav = new ModelAndView();
		User usuario = new User();
		mav.addObject("message", "Welcome to MVC");
		mav.addObject("user", usuario);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/formData")
	@ResponseBody
	public ModelAndView form(@Valid @ModelAttribute User user, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.addObject("message", "Hubieron errores intentando agregar una persona");
			mav.setViewName("main");
		}
		else {
			mav.addObject("message", "Persona agregada con exito");
			mav.setViewName("form");
		}
		return mav;
	}
}
