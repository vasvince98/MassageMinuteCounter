package com.vasvince.massageminutecounter.Repository;

import com.vasvince.massageminutecounter.Model.Massage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface MassageRepository extends CrudRepository<Massage, Integer> {
    Massage findByaction(String action);
    Massage findFirstByOrderByIdDesc();
}
