package com.walid.livre.Gestion.livre.core.services;

import com.walid.livre.Gestion.livre.core.domain.Livre;

import com.walid.livre.Gestion.livre.exception.ResourceNotFoundException;
import com.walid.livre.Gestion.livre.port.inbound.LivreServices;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class LivreServiceImpl implements LivreServices {

    @Override
    public List<Livre> getAllLivres() {
        return null;
    }

    @Override
    public Livre getLivreById(String LivreId) {
        return null;
    }

    @Override
    public Livre updateLivre(Livre Livre, String LivreId) {
        return null;
    }

    @Override
    public ResponseEntity<Livre> deleteLivre(String LivreId) {
        return null;
    }
}
