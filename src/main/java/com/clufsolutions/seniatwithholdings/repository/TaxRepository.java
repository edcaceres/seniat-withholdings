package com.clufsolutions.seniatwithholdings.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.clufsolutions.seniatwithholdings.domain.Tax;

@RepositoryRestResource
public interface TaxRepository extends CrudRepository<Tax, Long> {

}
