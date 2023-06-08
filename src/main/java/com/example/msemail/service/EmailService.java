package com.example.msemail.service;

import com.example.msemail.dao.EmailRepository;
import com.example.msemail.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(Email email) {

    }
}
