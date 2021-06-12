package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ParamFluxCreService;
import com.example.demo.model.ParamFluxCre;
@RestController
public class ParamFluxCreController {
	@Autowired
	ParamFluxCreService paramFluxCreService;
	
	// creating a get mapping that retrieves all the evt detail from the database
		@GetMapping("/evt")
		private List<ParamFluxCre> getAllEvts() {
			return paramFluxCreService.getAllEvts();
		}

		// creating a get mapping that retrieves the detail of a specific evenement 
		@GetMapping("/evt/{evtid}")
		private ParamFluxCre getParams(@PathVariable("evtid") String code_evenement) {
			return paramFluxCreService.getEvtsByCodeEvt(code_evenement);
		}

		// creating a delete mapping that deletes a specified evenement
		@DeleteMapping("/evt/{evtid}")
		private String deleteParam(@PathVariable("evtid") String code_evenement) {
			paramFluxCreService.delete(code_evenement);
			return "evenement supp avec succees";
		}

		// creating post mapping that post the evenements detail in the database
		@PostMapping("/evts")
		private String saveEvt(@RequestBody ParamFluxCre evts) {
			paramFluxCreService.saveOrUpdate(evts);
			return "message ==> :votre evenement est ajouter avecc succees ";
		}

		// creating put mapping that updates the evenement detail
		@PutMapping("/evts/{evtid}")
		private ParamFluxCre update(@RequestBody ParamFluxCre evts, @PathVariable("evtid") String code_evenement) {
			paramFluxCreService.update(evts, code_evenement);
			return evts;
		}
}
