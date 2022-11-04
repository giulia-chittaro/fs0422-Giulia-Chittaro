package com.giuliachittaro.assegnazionedispositiviazielndali.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giuliachittaro.assegnazionedispositiviazielndali.entities.Dispositivo;

@Repository
public interface Dispositivorepository extends JpaRepository<Dispositivo, Long> {

}
