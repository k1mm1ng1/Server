package com.mingi.inquiry.domain.contact_us.controller;

import com.mingi.inquiry.domain.contact_us.dto.ContactRequestDto;
import com.mingi.inquiry.domain.contact_us.entity.Contact;
import com.mingi.inquiry.domain.contact_us.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/contacts")
    public ResponseEntity<?> contacts() {
        List contacts = contactService.findAll();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> joinContact(@RequestBody Contact contact){
        contactService.join(contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

//    @PostMapping("/create")
//    public void create(@RequestBody ContactRequestDto dto) {
//        contactService.createContact(dto);
//    }



}
