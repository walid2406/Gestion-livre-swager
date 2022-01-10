package com.walid.livre.Gestion.livre.UI;

import com.walid.livre.Gestion.livre.core.domain.Livre;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface LivreRestController {


    //les service du domaine en mapping

    @PostMapping
    Livre createLivre(@RequestBody Livre livre);

    @PutMapping("/{ISBN}")
     Livre updateLivre(@RequestBody Livre livre, @PathVariable("ISBN") String ISBN);

    @GetMapping("/{ISBN}")
    Livre getLivreById(@PathVariable(value = "id") String LivreId);

    @DeleteMapping("/{ISBN}")
     ResponseEntity< Livre > deleteLivre(@PathVariable("id") String LivreId);




//    //crud
//    Livre createLivre();
//    void updateLivre(Livre livre);
//    void supLivre(String ISBN);
//    void getInfolivre(Livre livre);
}
