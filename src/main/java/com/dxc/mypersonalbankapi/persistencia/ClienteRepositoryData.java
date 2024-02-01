package com.dxc.mypersonalbankapi.persistencia;

import com.dxc.mypersonalbankapi.modelos.clientes.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional(propagation = Propagation.MANDATORY)
public interface ClienteRepositoryData extends JpaRepository<Cliente, Integer> {
  /*  public List<Cliente> findByNombre(String nombre);
    public List<Cliente> findByNombreIgnoreCase(String nombre);
    public List<Cliente> findByNombreAndApellidoIgnoreCase(String nombre, String direccion);

    @Query("SELECT c FROM Cliente c WHERE c.nombre LIKE %:name%")
    public List<Cliente> findByNombreWith(@Param("name") String trozodenombre);

    @Query(value = "SELECT c.* FROM cliente c WHERE c.nombre LIKE %:name%", nativeQuery = true)
    public List<Cliente> findByNombreWithNative(@Param("name") String trozodenombre);*/
}
