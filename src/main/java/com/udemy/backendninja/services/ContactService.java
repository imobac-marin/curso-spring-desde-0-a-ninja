package com.udemy.backendninja.services;

import java.util.List;

import com.udemy.backendninja.entity.Contact;
import com.udemy.backendninja.model.ContactModel;

/**
 * The Interface ContactService.
 */
public interface ContactService {

	/**
	 * Adds the contact.
	 *
	 * @param contactModel the contact model
	 * @return the contact model
	 */
	public abstract ContactModel addContact(ContactModel contactModel);
	
	/**
	 * List all contacts.
	 *
	 * @return the list
	 */
	public abstract List<ContactModel> listAllContacts();
	
	/**
	 * Find contact by id.
	 *
	 * @param id the id
	 * @return the contact
	 */
	public abstract Contact findContactById(int id);
	
	/**
	 * Removes the contact.
	 *
	 * @param id the id
	 */
	public abstract void removeContact(int id);
	
	/**
	 * Find contact model by id.
	 *
	 * @param id the id
	 * @return the contact model
	 */
	public abstract ContactModel findContactModelById(int id);
}
