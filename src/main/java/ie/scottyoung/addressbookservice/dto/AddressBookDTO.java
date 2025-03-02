package ie.scottyoung.addressbookservice.dto;

import java.util.List;
public class AddressBookDTO {
    Long id;
    private String name;
    private List<AddressBookEntryDTO> addressBookEntries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddressBookEntryDTO> getAddressBookEntries() {
        return addressBookEntries;
    }

    public void setAddressBookEntries(List<AddressBookEntryDTO> addressBookEntries) {
        this.addressBookEntries = addressBookEntries;
    }
}
