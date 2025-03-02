package ie.scottyoung.addressbookservice.mapper;

import ie.scottyoung.addressbookservice.dto.AddressBookDTO;
import ie.scottyoung.addressbookservice.model.AddressBook;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressBookMapper {

    AddressBookMapper INSTANCE = Mappers.getMapper(AddressBookMapper.class);

    AddressBookDTO addressBookToAddressBookDTO(AddressBook addressBook);

    AddressBook addressBookDTOToAddressBook(AddressBookDTO addressBookDTO);
}