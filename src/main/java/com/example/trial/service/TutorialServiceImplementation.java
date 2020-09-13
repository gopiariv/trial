package com.example.trial.service;

import com.example.trial.model.Tutorial;
import com.example.trial.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TutorialServiceImplementation implements TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial findTutorialById(String id) {
        return null;
    }

    @Override
    public void createTutorial(Tutorial tutorial) {

    }

    @Override
    public void updateTutorial(Tutorial tutorial) {

    }

    @Override
    public void deleteTutorial(String id) {

    }
}
