package ie.scottyoung.addressbookservice.controller;

import ie.scottyoung.addressbookservice.dto.AddressBookDTO;
import ie.scottyoung.addressbookservice.mapper.AddressBookMapper;
import ie.scottyoung.addressbookservice.model.AddressBook;
import ie.scottyoung.addressbookservice.model.AddressBookEntry;
import ie.scottyoung.addressbookservice.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressBookController {
    //list all address books
    @Autowired
    AddressBookService service;
    @GetMapping("/address-book-service/addressbooks")
    public List<AddressBook> getAllAddressBooks(){
        return service.getAddressBooks();
    }

    @GetMapping("/address-book-service/addressbooks/{id}")
    public Optional<AddressBook> getAllAddressBooks(@PathVariable Long id){
        return service.getAddressBookById(id);
    }

    @PostMapping("/address-book-service/addressbooks")
    public ResponseEntity<AddressBookDTO>  createAddressBook(@RequestBody AddressBookDTO addressBookDTO){
        AddressBook addressBook = AddressBookMapper.INSTANCE.addressBookDTOToAddressBook(addressBookDTO);
        AddressBook createdAddressBook = service.createAddressBook(addressBook);
        return new ResponseEntity<>(AddressBookMapper.INSTANCE.addressBookToAddressBookDTO(createdAddressBook), HttpStatus.CREATED);
    }

    //update existing addressbook
    //delete existing addressbook
    //get specific addressbook entry (for an address book?)
    //search for an addressbbok entry by, name, address etc?
    //update specific addressbook entry
}
