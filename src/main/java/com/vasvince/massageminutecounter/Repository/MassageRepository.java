package com.vasvince.massageminutecounter.Repository;

import com.vasvince.massageminutecounter.Model.Massage;
import org.springframework.data.repository.CrudRepository;

import javax.swing.*;

public interface MassageRepository extends CrudRepository<Massage, Integer> {
    Massage findByaction(String action);
}
