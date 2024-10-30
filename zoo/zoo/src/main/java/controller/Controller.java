package controller;

import animal.Animal;
import animal.AnimalRepository;
import animal.DadosCadastroAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoo")
public class Controller {

    @Autowired
    private AnimalRepository repository;

    @PostMapping("/Panimais")
    public void cadastraranimal(@RequestBody DadosCadastroAnimal cadastroAnimal) {
        repository.save(new Animal(cadastroAnimal));
    }


}
