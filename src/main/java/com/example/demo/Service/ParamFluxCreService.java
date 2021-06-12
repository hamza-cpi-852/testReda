package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.ParamFluxCre;
import com.example.demo.repository.ParamFluxCreRepository;

@Service
public class ParamFluxCreService {

	@Autowired
	ParamFluxCreRepository paramFluxCreRepository;

	public List<ParamFluxCre> getAllEvts() {
		List<ParamFluxCre> evts = new ArrayList<ParamFluxCre>();
		paramFluxCreRepository.findAll().forEach(evt -> evts.add(evt));
		return evts;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public ParamFluxCre getEvtsByCodeEvt(String code_evenement) {
		return paramFluxCreRepository.findById(code_evenement).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(ParamFluxCre evts) {
		paramFluxCreRepository.save(evts);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(String code_evenement) {
		paramFluxCreRepository.deleteById(code_evenement);
	}

	// updating a record //,int bookid
	public void update(ParamFluxCre evts, String code_evenement) {
		paramFluxCreRepository.save(evts);
	}
}
