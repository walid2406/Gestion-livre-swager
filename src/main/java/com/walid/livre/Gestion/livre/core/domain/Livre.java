package com.walid.livre.Gestion.livre.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {

    @Column(name = "titre")
    String titre;
    @Column(name = "auteur")
    String auteur;
    @Column(name = "editeur")
    String editeur;

    public Livre() {
    }

    public Livre(String titre, String auteur, String editeur, String desc, String ISBN) {
        super();
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.desc = desc;
        this.ISBN = ISBN;
    }

    @Column(name = "descr")
    String desc;
    @Id
    String ISBN;


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
