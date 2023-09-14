package com.mingi.inquiry.domain.sggestion_us.entity;

import com.mingi.inquiry.domain.sggestion_us.dto.SuggestionRequestDto;
import lombok.*;

import javax.persistence.*;
import java.time.DayOfWeek;

@Entity
@Table(name = "suggestion")
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Suggestion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String class_name;
    @Column(nullable = false)
    private String class_content;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DayOfWeek class_day;
    private String etc;

    public Suggestion(SuggestionRequestDto suggestionRequestDto) {
        this.class_name = suggestionRequestDto.getClass_name();
        this.class_content = suggestionRequestDto.getClass_content();
        this.class_day = DayOfWeek.valueOf(suggestionRequestDto.getClass_day());
        this.etc = suggestionRequestDto.getEtc();
    }
}
