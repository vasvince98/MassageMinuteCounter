package com.vasvince.massageminutecounter.Repository;

import com.vasvince.massageminutecounter.Model.Massage;
import org.springframework.data.repository.CrudRepository;

public interface MassageRepository extends CrudRepository<Massage, Integer> {
    
}
