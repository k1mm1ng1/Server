package com.mingi.inquiry.domain.notice_us.dto;


import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

@Getter
public class NoticeRequestDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "내용이 공백일 수 없습니다.")
    private String content;
}
