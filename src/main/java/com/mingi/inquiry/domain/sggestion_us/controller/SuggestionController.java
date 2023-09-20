package com.mingi.inquiry.domain.sggestion_us.controller;

import com.mingi.inquiry.domain.sggestion_us.entity.Suggestion;
import com.mingi.inquiry.domain.sggestion_us.service.SuggestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SuggestionController { //suggestion

    private final SuggestionService suggestionService;


    @PostMapping("/creates")
    public ResponseEntity<?> createSuggestion(@RequestBody Suggestion suggestion) {
        suggestionService.create(suggestion);
        return new ResponseEntity<>(suggestion, HttpStatus.OK);
    }
    @GetMapping("/suggestions")
    public ResponseEntity<?> suggestions() {
        List suggestions = suggestionService.findAll();
        return new ResponseEntity<>(suggestions, HttpStatus.OK);
    }

//    @PostMapping("/etc")
//    public
}
