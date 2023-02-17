package com.randyluc.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.randyluc.dojosandninjas.models.Dojo;

@Repository
public interface DojoRepo  extends CrudRepository <Dojo,Long>{
	List<Dojo> findall();
}
