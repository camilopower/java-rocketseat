package br.modules.candidate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import br.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;



  @RestController
  @RequestMapping("/candidate")
  public class CandidateController {  

  
    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidateEntity){
      System.out.println("candidato");
      System.out.println(candidateEntity.getEmail());
      }
    }
