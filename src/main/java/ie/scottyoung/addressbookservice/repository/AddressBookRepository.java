package ie.scottyoung.addressbookservice.repository;

import ie.scottyoung.addressbookservice.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {

}
