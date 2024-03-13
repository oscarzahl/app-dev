package no.ntnu.repository;

import no.ntnu.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository interface for accessing Book data in the database.
 * Spring will auto-generate necessary methods.
 */
public interface BookRepository extends CrudRepository<Book, Integer> {
  /**
   * Find all books, use pagination.
   *
   * @param pageable Pagination configuration - limit and offset.
   *                 Use PageRequest.of(page, limit, sorting).
   * @return All books with given paging/limit
   */
  Page<Book> findAll(Pageable pageable);
}
