package com.mingi.inquiry.domain.notice_us.repository;

import com.mingi.inquiry.domain.notice_us.entity.Notice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class NoticeRepositoryImpl implements NoticeRepository{

    private final EntityManager em;

    @Override
    public Notice findById(long id) {
        return em.find(Notice.class, id);
    }

    @Override
    public List findAll() {
        return em.createQuery("select m from Notice m", Notice.class)
                .getResultList();
    }

    @Override
    public Notice save(Notice notice) {
        em.persist(notice);
        return notice;
    }

    @Override
    public void delete(Notice notice) {
        em.remove(notice);
    }
}
