package com.mz.cth.demo.controller;
//package com.mz.cth.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.mz.cth.model.Car;
//import com.mz.cth.model.Device;
//import com.mz.cth.model.Owner;
//import com.mz.cth.repository.CarRepository;
//import com.mz.cth.repository.OwnerRepository;
//@Controller
//public class CarController {
//	
//	@Autowired
//	private CarRepository carRepository;
//	
//	
//	@Autowired 
//	private OwnerRepository ownerRepository;
//	
//
//		@RequestMapping(value="/car", method=RequestMethod.GET)
//		public ModelAndView novo(Model model) {
//			ModelAndView mv = new ModelAndView("cars/register");
//		Iterable<Owner> owner =ownerRepository.findAll(); 
//			model.addAttribute("owners",owner);
//		mv.addObject(model);
//	return mv;
//		}
//
//		@RequestMapping(value="/car", method= RequestMethod.POST)
//		public String novo(Car car) {
//			 
//		carRepository.save(car);
//			return "redirect:/car";
//				
//		}
//		
//		@RequestMapping("/search_car")
//		public ModelAndView list() {
//			ModelAndView mv = new ModelAndView("cars/read_data");
//		  Iterable<Car> cars = carRepository.findAll(); // search database; 
//			 mv.addObject("cars", cars); // salva no model and view a lista e guarda na lista html
//			return mv;
//		}
//		
//		
//		
//		
//		
//}
