package org.surplus.radolf.Notebook.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.surplus.radolf.Notebook.entity.IdNumber;
import org.surplus.radolf.Notebook.repository.IdNumberRepository;
@Service
public class IdNumberService {
    private final IdNumberRepository idNumberRepository;

    public void deleteIdNumber(Long id) {
        idNumberRepository.delete(id);
    }

    public IdNumberService(IdNumberRepository idNumberRepository){
        this.idNumberRepository=idNumberRepository;
    }


    public Iterable<IdNumber> findAll() {
        return idNumberRepository.findAll();
    }

    public Page<IdNumber> findAllByOrderByInsertedAsc(Pageable pageable) {
        return idNumberRepository.findAllByOrderByInsertedAsc(pageable);
    }

    public Page<IdNumber> findAllByOrderByInsertedDesc(Pageable pageable) {
        return idNumberRepository.findAllByOrderByInsertedDesc(pageable);
    }

}
