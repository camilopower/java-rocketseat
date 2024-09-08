package br.camilo.module.camilo.controllers;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import lombok.Getter;
import lombok.Setter;



@SuppressWarnings("unused")
@Data
@Entity(name = "camilo")

public class CamiloEntity {
    
 @Id
 @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    private String name;
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [username] mão deve conter espaço")
    private String username;
    @Email(message = "O campo (email) deve conter um email valido")
    private String email;
    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;
   
 

   


     


}
