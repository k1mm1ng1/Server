package com.mingi.inquiry.domain.sggestion_us.dto;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

@Getter
public class SuggestionRequestDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "타이틀이 공백일 수 없습니다.")
    private String class_name;
    @Column(nullable = false)
    @NotBlank(message = "수업 내용이 공백일 수 없습니다.")
    private String class_content;
    @Column(nullable = false)
    @NotBlank(message = "수업 날짜가 공백일 수 없습니다.")
    private String class_day;
    private String etc;
}
