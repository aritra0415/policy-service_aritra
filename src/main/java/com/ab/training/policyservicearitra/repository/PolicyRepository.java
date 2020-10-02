package com.ab.training.policyservicearitra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ab.training.policyservicearitra.model.Policy;

public interface PolicyRepository extends MongoRepository<Policy, String> {

}
