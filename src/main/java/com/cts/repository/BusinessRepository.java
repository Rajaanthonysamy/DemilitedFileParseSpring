package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.BusinessDetails;
//Jparepository
@Repository
public interface BusinessRepository extends JpaRepository<BusinessDetails, Integer> {

}
