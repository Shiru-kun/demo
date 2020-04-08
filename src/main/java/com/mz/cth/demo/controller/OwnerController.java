package com.mz.cth.demo.controller;
//package com.mz.cth.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.mz.cth.model.Owner;
//import com.mz.cth.repository.OwnerRepository;
//
//@Controller
//public class OwnerController {
//
//@Autowired
//private OwnerRepository ownerRepository; 
//	
//	
//	//Metedo que inicia que chama a Pagina Inicial
//	@RequestMapping(value="/owner", method=RequestMethod.GET)
//	public ModelAndView novo() {
//		ModelAndView mv = new ModelAndView("owners/register");
//			return mv;
//	}
//	@RequestMapping(value="/owner", method= RequestMethod.POST)
//	public String novo(Owner owner) {
//	
//		ownerRepository.save(owner);  
//		return "redirect:/owner";
//			
//	}
//	
//	@RequestMapping("/search_owner")
//	public ModelAndView list() {
//		ModelAndView mv = new ModelAndView("owners/read_data");
//	  Iterable<Owner> owns = ownerRepository.findAll(); // search database; 
//		 mv.addObject("owners", owns); // salva no model and view a lista e guarda na lista html
//		return mv;
//	}
//	
//	
//	// path variable requisicoes especificas
//	
//	
//	
//	@RequestMapping("oner/{id}")
//	public ModelAndView ownerDescription(@PathVariable("id") long id) {
//		Owner owns =  ownerRepository.findById(id);
//		ModelAndView mv = new ModelAndView("owners/ownerDescription");
//		mv.addObject("owners", owns);	
//		return mv;	
//	}
//	
//	// aula 14 delete um linha na tabela 
//	@RequestMapping("/delete_owner")	
//public String delete(long id) {
//	Owner owner = ownerRepository.findById(id);
//	ownerRepository.delete(owner);
//		return "redirect:/search_owner";
//	
//		
//		
//}
//	@GetMapping("/update_owner/{id}")
//	public String updateform( @PathVariable("id") long id, Model model) {
//		
//		Owner owner = ownerRepository.findById(id);
//		model.addAttribute("owners", owner);
//		return "owners/update-owner";
//		
//		
//	}
//	
//	@PostMapping("/update_owner/{id}")
//	public String updateDevice(@PathVariable("id") long id, @Valid Owner owner, BindingResult result, Model model) {
//		if(result.hasErrors()) {
//			owner.setId(id);
//			return "owners/update-owner";
//			
//		}
//		ownerRepository.save(owner);
//		model.addAttribute("owner",ownerRepository.findAll());
//		return "redirect:/search_owner";
//		
//		
//		
//	}	
//}
