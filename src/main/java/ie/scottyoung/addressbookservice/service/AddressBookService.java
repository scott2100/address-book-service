package ie.scottyoung.addressbookservice.service;

import ie.scottyoung.addressbookservice.dto.AddressBookDTO;
import ie.scottyoung.addressbookservice.model.AddressBook;
import ie.scottyoung.addressbookservice.model.AddressBookEntry;
import ie.scottyoung.addressbookservice.repository.AddressBookEntryRepository;
import ie.scottyoung.addressbookservice.repository.AddressBookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressBookService {

    @Autowired
    private AddressBookRepository repository;

    @Transactional
    public AddressBook createAddressBook(AddressBook addressBook){
        if (addressBook.getAddressBookEntries() != null) {
            for (AddressBookEntry entry : addressBook.getAddressBookEntries()) {
                entry.setAddressBook(addressBook); // Set the addressBook field
            }
        }
        return repository.save(addressBook);
    }
    public List<AddressBook> getAddressBooks(){
        return repository.findAll();
    }
    public Optional<AddressBook> getAddressBookById(Long id){
        return repository.findById(id);
    }
}
