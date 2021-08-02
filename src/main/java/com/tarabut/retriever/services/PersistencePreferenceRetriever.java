package com.tarabut.retriever.services;

import org.springframework.stereotype.Service;

@Service
public class PersistencePreferenceRetriever implements PreferenceRetrieverService {

    @Override
    public String retrievePreferencesForUserId(String userId) {
        return "test";
    }
}
