package com.walid.livre.Gestion.livre.adapter.secondary;


import com.walid.livre.Gestion.livre.core.domain.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Livre,String> {
}
