package br.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;


@Data


public class CandidateEntity {
 

    
    private UUID id;
    private String name;



    @Pattern(regexp =  "^(?!\\s*$).+", message = " O campo [username] não deve conter espaço")

    private String username;
 
 
    @Email(message = "0 campo (email) deve conter um e-mail válido") 
    private String email;
    private String password;



   @Length(min = 10, max = 100)

    private String description;
    private String curriculum;


}
 