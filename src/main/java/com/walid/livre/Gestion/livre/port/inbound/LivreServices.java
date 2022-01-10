package com.walid.livre.Gestion.livre.port.inbound;


import com.walid.livre.Gestion.livre.core.domain.Livre;
import com.walid.livre.Gestion.livre.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface LivreServices {


    //crud
    // get all Livres
//    @GetMapping
    public List< Livre > getAllLivres();
    // get Livre by id
//    @GetMapping("/{id}")
    public Livre getLivreById( String LivreId);
    // create Livre
//    @PostMapping
//    public Livre createLivre(@RequestBody Livre livre);
    // update Livre
//    @PutMapping("/{id}")
    public Livre updateLivre( Livre Livre, String LivreId);
    // delete Livre by id
//    @DeleteMapping("/{id}")
    public ResponseEntity< Livre > deleteLivre( String LivreId);

}
