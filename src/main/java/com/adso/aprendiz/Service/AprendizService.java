package com.adso.aprendiz.Service;

import com.adso.aprendiz.Entity.AprendizEntity;
import com.adso.aprendiz.Repository.AprendizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AprendizService {
    @Autowired
    private AprendizRepository aprendizRepository;

    public void crearAprendiz(AprendizEntity aprendiz){
        aprendizRepository.save(aprendiz);
    }

    public List<AprendizEntity> obtenerAprendices(){
        return aprendizRepository.findAll();
    }

    public AprendizEntity buscarPorId(long id){
        return aprendizRepository.findById(id).orElse(null);
    }

    public void eliminarAprendiz(long id){
        aprendizRepository.deleteById(id);
    }

    public AprendizEntity actualizarAprendiz(Long id, AprendizEntity aprendiz) {
        AprendizEntity aprendizExistente = aprendizRepository.findById(id).orElse(null);
        return aprendizExistente != null ? aprendizRepository.save(aprendiz):null;
    }


}
