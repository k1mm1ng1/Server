package com.mingi.inquiry.domain.contact_us.service;

import com.mingi.inquiry.domain.contact_us.dto.ContactRequestDto;
import com.mingi.inquiry.domain.contact_us.entity.Contact;
import com.mingi.inquiry.domain.contact_us.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public List findAll(){
        return contactRepository.findAll();
    }
    public Contact Create(Contact contact){
        return contactRepository.save(contact);
    }

    @Autowired
    public ContactService(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    public void createContact(ContactRequestDto dto) {
        contactRepository.save(Contact.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .teacher(dto.getTeacher())
                .build());
    }

//    @GetMapping("/api/contact/{title}")
//    public List<Contact> listContact(@PathVariable String title){
//        return contactRepository.findAllBy();
//    }
}
