package br.com.isidrocorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.eventdash.model.Alarme;


public interface AlarmeDAO extends  CrudRepository<Alarme, Integer>{

	
}
