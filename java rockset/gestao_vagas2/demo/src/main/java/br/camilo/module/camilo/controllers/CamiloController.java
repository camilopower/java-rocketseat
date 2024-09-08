package br.camilo.module.camilo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
       
    
    @RestController
    @RequestMapping("/camilo")
    public class CamiloController {

        @PostMapping("/")
        public void create(@RequestBody CamiloEntity camiloEntity ) {
         System.out.println("camilo");
         System.out.println(camiloEntity.getEmail());
    }
}