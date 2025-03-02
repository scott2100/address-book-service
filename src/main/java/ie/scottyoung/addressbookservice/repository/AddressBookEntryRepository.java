package ie.scottyoung.addressbookservice.repository;

import ie.scottyoung.addressbookservice.model.AddressBookEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookEntryRepository extends JpaRepository<AddressBookEntry, Long> {

}
