package restapi.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import restapi.demo.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
