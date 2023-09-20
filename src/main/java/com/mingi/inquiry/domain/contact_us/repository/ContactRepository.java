package com.mingi.inquiry.domain.contact_us.repository;

import com.mingi.inquiry.domain.contact_us.entity.Contact;
import java.util.List;

//extends JpaRepository<Contact,Long>
public interface ContactRepository {

    List<Contact> findAll();
    Contact save(Contact contact);

}

