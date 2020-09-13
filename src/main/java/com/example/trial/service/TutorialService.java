package com.example.trial.service;

import com.example.trial.model.Tutorial;

import java.util.List;

public interface TutorialService {
    List<Tutorial> findAll();

    Tutorial findTutorialById(String id);

    void createTutorial(Tutorial tutorial);

    void updateTutorial(Tutorial tutorial);

    void deleteTutorial(String id);
}
