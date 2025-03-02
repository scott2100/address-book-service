package ie.scottyoung.addressbookservice.mapper;

import ie.scottyoung.addressbookservice.dto.AddressBookEntryDTO;
import ie.scottyoung.addressbookservice.dto.AddressBookDTO;
import ie.scottyoung.addressbookservice.model.AddressBook;
import ie.scottyoung.addressbookservice.mapper.AddressBookEntryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {AddressBookEntryMapper.class})
public interface AddressBookMapper {

    AddressBookMapper INSTANCE = Mappers.getMapper(AddressBookMapper.class);

    AddressBookDTO addressBookToAddressBookDTO(AddressBook addressBook);

    @Mapping(target = "addressBookEntries", source = "addressBookEntries", qualifiedByName = "setAddressBook")
    AddressBook addressBookDTOToAddressBook(AddressBookDTO addressBookDTO);

}