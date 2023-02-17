package com.randyluc.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randyluc.dojosandninjas.models.Dojo;
import com.randyluc.dojosandninjas.models.Ninja;
import com.randyluc.dojosandninjas.repositories.DojoRepo;
import com.randyluc.dojosandninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepo ninrepo;
	@Autowired
	private DojoRepo dorepo;
	
	public List <Dojo>allDojos(){
		return this.dorepo.findall();
	}
	public Dojo createDojo (Dojo dojo) {
		return this.dorepo.save(dojo);
	}
	public Ninja createNinja (Ninja ninja) {
		return this.ninrepo.save(ninja);
	}
	
	public Dojo getOneDojo(Long id) {
		return this.dorepo.findById(id).orElse(null);
	}
}
