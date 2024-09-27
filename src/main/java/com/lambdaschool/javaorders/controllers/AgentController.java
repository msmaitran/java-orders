package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Agents;
import com.lambdaschool.javaorders.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping(value = "/agent/{id}",
                produces = {"application/json"})
    public ResponseEntity<?> findAgentById(@PathVariable long id) {
        Agents myAgent = agentService.findAgentById(id);
        return new ResponseEntity<>(myAgent, HttpStatus.OK);
    }
}
