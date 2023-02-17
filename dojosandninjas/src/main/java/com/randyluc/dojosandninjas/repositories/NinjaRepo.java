package com.randyluc.dojosandninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.randyluc.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository <Ninja,Long>{
}
