package com.mingi.inquiry.domain.sggestion_us.repository;


import com.mingi.inquiry.domain.sggestion_us.entity.Suggestion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SuggestionRepositoryImpl implements SuggestionRepository {
    private final EntityManager em;

    @Override
    public List findAll() {
        return em.createQuery("select m from Suggestion m", Suggestion.class)
                .getResultList();
    }

    @Override
    public Suggestion save(Suggestion suggestion) {
        em.persist(suggestion);
        return suggestion;
    }
}
