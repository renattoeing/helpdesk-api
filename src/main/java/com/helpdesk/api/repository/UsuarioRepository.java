package com.helpdesk.api.repository;

import com.helpdesk.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuriousRepository extends JpaRepository<Usuario, Long> {
}
