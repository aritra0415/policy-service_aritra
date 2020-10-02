package com.ab.training.policyservicearitra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ab.training.policyservicearitra.model.Policy;
import com.ab.training.policyservicearitra.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	
	@RequestMapping(value = "/hello")
	public String hello() {
		return "I am in the policy springboot app !!";
	}
	
	@RequestMapping(value = "/createpolicy", method = RequestMethod.POST)
	public Policy createPolicy(@RequestBody Policy policy) {
		return policyService.createPolicy(policy);
	}
	
	@RequestMapping(value = "/getPolicies", method = RequestMethod.GET)
	public List<Policy> getPolicies() {
		return policyService.getPolicies();
	}
	
	@RequestMapping(value = "/createExchangePolicy", method = RequestMethod.POST)
	public Policy createExchangePolicy(@RequestBody Policy policy) {
		return policyService.createExchangePolicy(policy);
	}
	
	@RequestMapping(value = "/createObjectPolicy", method = RequestMethod.POST)
	public Policy createObjectPolicy(@RequestBody Policy policy) {
		return policyService.createObjectPolicy(policy);
	}

}
