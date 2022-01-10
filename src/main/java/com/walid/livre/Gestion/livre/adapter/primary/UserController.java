package com.walid.livre.Gestion.livre.adapter.primary;
import com.walid.livre.Gestion.livre.UI.LivreRestController;
import com.walid.livre.Gestion.livre.core.domain.Livre;
import com.walid.livre.Gestion.livre.exception.ResourceNotFoundException;
import com.walid.livre.Gestion.livre.adapter.secondary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Livres")
public class UserController implements LivreRestController {

    @Autowired
    private UserRepository userRepository;

    // get all Livres
    @GetMapping
    public List < Livre > getAllLivres() {
        return this.userRepository.findAll();
    }

    // get Livre by id
    @GetMapping("/{id}")
    public Livre getLivreById(@PathVariable(value = "id") String LivreId) {
        return this.userRepository.findById(LivreId)
                .orElseThrow(() -> new ResourceNotFoundException("Livre not found with id :" + LivreId));
    }

    // create Livre
    @PostMapping
    public Livre createLivre(@RequestBody Livre livre) {

        return this.userRepository.save(livre);
    }

    // update Livre
    @PutMapping("/{id}")
    public Livre updateLivre(@RequestBody Livre Livre, @PathVariable("id") String LivreId) {
        Livre existingLivre = this.userRepository.findById(LivreId)
                .orElseThrow(() -> new ResourceNotFoundException("Livre not found with id :" + LivreId));
        existingLivre.setAuteur(Livre.getAuteur());
        existingLivre.setEditeur(Livre.getEditeur());
        existingLivre.setTitre(Livre.getTitre());
        return this.userRepository.save(existingLivre);
    }





    // delete Livre by id
    @DeleteMapping("/{id}")
    public ResponseEntity < Livre > deleteLivre(@PathVariable("id") String LivreId) {
        Livre existingLivre = this.userRepository.findById(LivreId)
                .orElseThrow(() -> new ResourceNotFoundException("Livre not found with id :" + LivreId));
        this.userRepository.delete(existingLivre);
        return ResponseEntity.ok().build();
    }
}




/* code walid a rechercher erreur

@RestController

@RequestMapping("/api/Livres")
public class LivreController {
    @Autowired
    private UserRepository UserRepository;

    //get all Livre
    @GetMapping
    public List<Livre> getAllLivres() {
        return this.UserRepository.findAll();

    }

    //    get Livre by id
    @GetMapping("/{id}")
    public Livre getLivreById(@PathVariable(value = "id") long LivreId) {
        return this.UserRepository.findById(LivreId).orElseThrow(() -> new ResourceNotFoundException(
                "utilisateur non present dans la table avec id= " + LivreId));


    }

//    create Livre

    @PostMapping
    public Livre createLivre(@RequestBody Livre Livre) {
        return UserRepository.save(Livre);


    }

    //    update Livre
    @PutMapping("/{id}")
    public Livre updateLivre(@RequestBody Livre Livre, @PathVariable("id") long LivreId)
    {
        Livre existing=this.UserRepository.findById(LivreId).orElseThrow(() -> new ResourceNotFoundException(
                "utilisateur non present dans la table avec id= " + LivreId));
        existing.setFirstName(Livre.getFirstName());
        existing.setLastName(Livre.getLastName());
        existing.setEmail(Livre.getEmail());
        return this.UserRepository.save(existing);

    }


//    delete Livre by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Livre> deleteLivre(@PathVariable("id") long LivreId){

        Livre existing=this.UserRepository.findById(LivreId).orElseThrow(() -> new ResourceNotFoundException(
                "utilisateur non present dans la table avec id= " + LivreId));


        this.UserRepository.delete(existing);
        return ResponseEntity.ok().build();

    }
}
*/