package com.mingi.inquiry.domain.notice_us.service;

import com.mingi.inquiry.domain.notice_us.entity.Notice;
import com.mingi.inquiry.domain.notice_us.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public List findAll() {
        return noticeRepository.findAll();
    }

    public Notice create(Notice notice) {
        return noticeRepository.save(notice);
    }

    public void delete(long id) {
        Notice notice = noticeRepository.findById(id);
        noticeRepository.delete(notice);
    }
}
