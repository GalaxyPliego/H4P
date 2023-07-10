package mx.edu.uteq.home4pets.repository;

import java.util.List;

import mx.edu.uteq.home4pets.entity.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
    List<Blog> findAllByIsPrincipal(Boolean isPrincipal);
    Page<Blog> findAllByOrderByCreatedAtDesc(Pageable peagable);
}
