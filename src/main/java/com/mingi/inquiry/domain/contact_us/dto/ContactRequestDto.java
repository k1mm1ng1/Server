package com.mingi.inquiry.domain.contact_us.dto;

import com.mingi.inquiry.domain.contact_us.entity.Contact;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

@Getter
public class ContactRequestDto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "타이틀이 널일 수 없습니다.") //null, "", " ", "  " X
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "콘텐츠가 널일 수 없습니다.")
    private String content;
}
