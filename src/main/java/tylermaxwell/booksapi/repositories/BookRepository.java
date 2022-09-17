package tylermaxwell.booksapi.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tylermaxwell.booksapi.models.Book;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
