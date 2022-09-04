package com.vasvince.massageminutecounter.Service;

import com.vasvince.massageminutecounter.Interface.IMassageService;
import com.vasvince.massageminutecounter.Model.Massage;
import com.vasvince.massageminutecounter.Model.User;
import com.vasvince.massageminutecounter.Repository.MassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MassageService implements IMassageService {

    MassageRepository massageRepository;

    @Autowired
    public MassageService(MassageRepository massageRepository) {
        this.massageRepository = massageRepository;
    }

    @Override
    public int addMinutes(int minutes, User user) {
        int remainingMinutes = massageRepository.findFirstByOrderByIdDesc().getRemainingMinutes() + minutes;
        Massage currentMassage = new Massage(remainingMinutes, "ADD", minutes, LocalDateTime.now());
        massageRepository.save(currentMassage);
        return remainingMinutes;
    }

    @Override
    public int removeMinutes(int minutes, User user) {
        int remainingMinutes = massageRepository.findFirstByOrderByIdDesc().getRemainingMinutes() - minutes;
        Massage currentMassage = new Massage(remainingMinutes, "REMOVE", minutes, LocalDateTime.now());
        massageRepository.save(currentMassage);
        return remainingMinutes;
    }
}
