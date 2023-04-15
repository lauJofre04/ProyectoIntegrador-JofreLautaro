
package com.portfolio.mgb.Repository;

import com.portfolio.mgb.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);

    public boolean existsById(int id);

    public void deleteById(int id);

    public Optional<Persona> findById(int id);
}
