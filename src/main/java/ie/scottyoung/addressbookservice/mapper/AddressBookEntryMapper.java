package ie.scottyoung.addressbookservice.mapper;

import ie.scottyoung.addressbookservice.dto.AddressBookEntryDTO;
import ie.scottyoung.addressbookservice.model.AddressBookEntry;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressBookEntryMapper {

    AddressBookEntryMapper INSTANCE = Mappers.getMapper(AddressBookEntryMapper.class);

    @Mapping(source = "addressBook.id", target = "addressBookId")
    AddressBookEntryDTO addressBookEntryToAddressBookEntryDTO(AddressBookEntry addressBookEntry);

    @Named("setAddressBook")
    @Mapping(target = "addressBook.id", source = "addressBookId")
    AddressBookEntry addressBookEntryDTOToAddressBookEntry(AddressBookEntryDTO addressBookEntryDTO);
}