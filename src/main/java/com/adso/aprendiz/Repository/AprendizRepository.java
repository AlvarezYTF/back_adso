package com.adso.aprendiz.Repository;

import com.adso.aprendiz.Entity.AprendizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AprendizRepository extends JpaRepository<AprendizEntity, Long>

{

}
