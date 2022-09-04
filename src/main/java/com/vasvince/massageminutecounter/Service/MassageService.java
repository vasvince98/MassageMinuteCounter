package com.vasvince.massageminutecounter.Service;

import com.vasvince.massageminutecounter.Interface.IMassageService;
import org.springframework.stereotype.Service;

@Service
public class MassageService implements IMassageService {
    @Override
    public int addMinutes(int minutes) {
        return 0;
    }

    @Override
    public int removeMinutes(int minutes) {
        return 0;
    }
}
