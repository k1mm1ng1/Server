package com.mingi.inquiry.domain.contact_us.repository;

import com.mingi.inquiry.domain.contact_us.entity.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContactRepositoryImpl implements ContactRepository {
    private final EntityManager em;

    @Override
    public List findAll(){
        return em.createQuery("select m from Contact m", Contact.class)
                .getResultList();
    }

    @Override
    public Contact save(Contact contact){
        em.persist(contact);
        return contact;
    }
}
