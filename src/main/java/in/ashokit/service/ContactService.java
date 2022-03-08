package in.ashokit.service;

import java.util.List;

import in.ashokit.bindings.ContactForm;

public interface ContactService {
	
	public String save(ContactForm form);
	
	public List<ContactForm> viewContacts();
	
	public ContactForm editContact(Integer contactId);//with keyId editing
	
	public List<ContactForm> deleteContact(Integer contactId);//with keyId deleting
	
}	
