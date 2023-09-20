package com.mingi.inquiry.domain.notice_us.repository;

import com.mingi.inquiry.domain.notice_us.entity.Notice;

import java.util.List;

public interface NoticeRepository{
    Notice findById(long id);
    List<Notice> findAll();
    Notice save(Notice notice);
    void delete(Notice notice);
}
