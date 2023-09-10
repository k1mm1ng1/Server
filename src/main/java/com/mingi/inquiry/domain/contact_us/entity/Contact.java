package com.mingi.inquiry.domain.contact_us.entity;

import com.mingi.inquiry.domain.contact_us.dto.ContactRequestDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "contact")
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Contact {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String teacher;

    public Contact(ContactRequestDto contactRequestDto){
        this.title = contactRequestDto.getTitle();
        this.content = contactRequestDto.getContent();
        this.teacher = contactRequestDto.getTeacher();

    }

}
