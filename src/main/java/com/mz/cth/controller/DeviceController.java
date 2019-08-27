package com.mz.cth.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mz.cth.model.Device;
import com.mz.cth.repository.DeviceRepository;

@Controller
public class DeviceController {
	
@Autowired
private DeviceRepository deviceRepository; 
	
	
	//Metedo que inicia que chama a Pagina Inicial
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("devices/register");
			return mv;
	}
	@RequestMapping(value="/new", method= RequestMethod.POST)
	public String novo(Device device) {
	
deviceRepository.save(device);  
		return "redirect:/new";
			
	}
	
	@RequestMapping("/search")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("devices/read_data");
	  Iterable<Device> devs = deviceRepository.findAll(); // search database; 
		 mv.addObject("devices", devs); // salva no model and view a lista e guarda na lista html
		return mv;
	}
	
	
	// path variable requisicoes especificas
	
	
	
	@RequestMapping("/{id}")
	public ModelAndView deviceDescription(@PathVariable("id") long id) {
		Device devs =  deviceRepository.findById(id);
		ModelAndView mv = new ModelAndView("devices/deviceDescription");
		mv.addObject("devices", devs);	
		return mv;	
	}
	
	// aula 14 delete um linha na tabela 
	@RequestMapping("/delete")	
public String delete(long id) {
	Device device = deviceRepository.findById(id);
	deviceRepository.delete(device);
		return "redirect:/search";
	
		
		
}
	@GetMapping("/update/{id}")
	public String updateform( @PathVariable("id") long id, Model model) {
		
		Device device = deviceRepository.findById(id);
		model.addAttribute("device", device);
		return "devices/update-device";
		
		
	}
	
	@PostMapping("/update/{id}")
	public String updateDevice(@PathVariable("id") long id, @Valid Device device, BindingResult result, Model model) {
		if(result.hasErrors()) {
			device.setId(id);
			return "devices/update-device";
			
		}
		deviceRepository.save(device);
		model.addAttribute("device",deviceRepository.findAll());
		return "redirect:/search";
		
		
		
	}	
}