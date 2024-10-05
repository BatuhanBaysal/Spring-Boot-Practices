package com.batuhan.contacts.service;

import java.util.List;

import com.batuhan.contacts.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
    List<Contact> getContacts();
    void deleteContact(String id);
}