package com.mingi.inquiry.domain.sggestion_us.repository;

import com.mingi.inquiry.domain.sggestion_us.entity.Suggestion;

import java.util.List;

public interface SuggestionRepository {

    List<Suggestion> findAll();

    Suggestion save(Suggestion suggestion);
}
