package com.mingi.inquiry.domain.notice_us.controller;

import com.mingi.inquiry.domain.notice_us.entity.Notice;
import com.mingi.inquiry.domain.notice_us.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/notices")
@RequiredArgsConstructor
public class NoticeController {
    @Autowired
    private final NoticeService noticeService;

    @PostMapping("/notice/create")
    public ResponseEntity<?> createNotice(@RequestBody Notice notice) {
        noticeService.create(notice);
        return new ResponseEntity<>(notice, HttpStatus.OK);
    }

    @GetMapping("/notice")
    public ResponseEntity<?> notices() {
        List notices = noticeService.findAll();
        return new ResponseEntity<>(notices, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Valid long id) {
        noticeService.delete(id);
    }
}
