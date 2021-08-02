package com.tarabut.retriever.controllers;

import com.tarabut.retriever.services.PreferenceRetrieverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PreferenceRetrieverController {

    @Autowired
    PreferenceRetrieverService preferenceRetrieverService;

    @GetMapping(value = "retrieve/preference/by")
    @ResponseBody
    public String getStoriesFromForumPage(@RequestParam(value = "user") String userId) {
        return preferenceRetrieverService.retrievePreferencesForUserId(userId);
    }
}