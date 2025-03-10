package ie.scottyoung.addressbookservice.model;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class AddressBook {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "addressBook", cascade = CascadeType.ALL)
    private List<AddressBookEntry> addressBookEntries;

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

    public List<AddressBookEntry> getAddressBookEntries() {
        return addressBookEntries;
    }

    public void setAddressBookEntries(List<AddressBookEntry> addressBookEntries) {
        this.addressBookEntries = addressBookEntries;
    }
}
