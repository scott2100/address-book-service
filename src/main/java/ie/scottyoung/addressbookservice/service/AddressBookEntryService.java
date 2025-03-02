package ie.scottyoung.addressbookservice.service;

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
public class AddressBookEntryService {
    @Autowired
    private AddressBookEntryRepository repository;
    @Autowired
    private AddressBookRepository addressBookRepository;

    @Transactional
    public AddressBookEntry createAddressBookEntry(AddressBookEntry addressBookEntry, Long addressBookId) {
        AddressBook addressBook = addressBookRepository.findById(addressBookId).orElse(null);
        if (addressBook == null) {
            // Handle the case where the AddressBook doesn't exist
            return null;
        }
        addressBookEntry.setAddressBook(addressBook);
        return repository.save(addressBookEntry);
    }
    public List<AddressBookEntry> getAddressBookEntries(){
        return repository.findAll();
    }
    public Optional<AddressBookEntry> getAddressEntryById(Long id){
        return repository.findById(id);
    }
}
