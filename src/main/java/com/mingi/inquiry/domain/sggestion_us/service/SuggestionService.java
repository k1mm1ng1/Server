package com.mingi.inquiry.domain.sggestion_us.service;

import com.mingi.inquiry.domain.sggestion_us.dto.SuggestionRequestDto;
import com.mingi.inquiry.domain.sggestion_us.entity.Suggestion;
import com.mingi.inquiry.domain.sggestion_us.repository.SuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.DayOfWeek;
import java.util.List;

@Transactional
@Service
public class SuggestionService {

    private final SuggestionRepository suggestionRepository;

    public List findAll() {
        return suggestionRepository.findAll();
    }

    public Suggestion Create(Suggestion suggestion) {
        return suggestionRepository.save(suggestion);
    }

    @Autowired
    public SuggestionService(SuggestionRepository suggestionRepository){
        this.suggestionRepository = suggestionRepository;
    }

    public void createSuggestion(SuggestionRequestDto dto) {
        suggestionRepository.save(Suggestion.builder()
                .class_name(dto.getClass_name())
                .class_content(dto.getClass_content())
                .class_day(DayOfWeek.valueOf(dto.getClass_day()))
                .etc(dto.getEtc())
                .build());
    }

}
