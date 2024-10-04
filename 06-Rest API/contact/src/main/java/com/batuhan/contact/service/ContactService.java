package com.batuhan.contact.service;

import java.util.List;

import javax.naming.NotContextException;

import com.batuhan.contact.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id) throws NotContextException;
    void saveContact(Contact contact);
    void updateContact(String id, Contact contact) throws NotContextException;
    void deleteContact(String id) throws NotContextException;
    List<Contact> getContacts();
}