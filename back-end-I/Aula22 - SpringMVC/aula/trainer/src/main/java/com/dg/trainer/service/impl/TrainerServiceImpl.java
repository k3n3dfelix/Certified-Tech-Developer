package com.dg.trainer.service.impl;

import com.dg.trainer.model.Trainer;
import com.dg.trainer.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {
    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("MArcos"), new Trainer("Ana"));
    }
}
