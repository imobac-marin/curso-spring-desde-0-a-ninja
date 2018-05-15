package com.udemy.backendninja.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.converter.ContactConverter;
import com.udemy.backendninja.entity.Contact;
import com.udemy.backendninja.model.ContactModel;
import com.udemy.backendninja.repository.ContactRepository;
import com.udemy.backendninja.services.ContactService;

/**
 * The Class ContactServiceImpl.
 */
@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {

	/** The contact repository. */
	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;

	/** The contact converter. */
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;

	/* (non-Javadoc)
	 * @see com.udemy.backendninja.services.ContactService#addContact(com.udemy.backendninja.model.ContactModel)
	 */
	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact contact = contactRepository.save(contactConverter.convert2Contact(contactModel));
		return contactConverter.convert2ContactModel(contact);
	}

	/* (non-Javadoc)
	 * @see com.udemy.backendninja.services.ContactService#listAllContacts()
	 */
	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> contacts = contactRepository.findAll();
		List<ContactModel> contactsModel = new ArrayList<>();
		for (Contact contact : contacts) {
			contactsModel.add(contactConverter.convert2ContactModel(contact));
		}
		return contactsModel;
	}

	/* (non-Javadoc)
	 * @see com.udemy.backendninja.services.ContactService#findContactById(int)
	 */
	@Override
	public Contact findContactById(int id) {
		return contactRepository.findById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.udemy.backendninja.services.ContactService#findContactModelById(int)
	 */
	public ContactModel findContactModelById(int id){
		return contactConverter.convert2ContactModel(findContactById(id));
	}

	/* (non-Javadoc)
	 * @see com.udemy.backendninja.services.ContactService#removeContact(int)
	 */
	@Override
	public void removeContact(int id) {
		Contact contact = contactRepository.findById(id);
		if (null != contact)
			contactRepository.delete(contact);
	}

}
