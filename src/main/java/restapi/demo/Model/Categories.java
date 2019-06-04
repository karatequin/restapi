package restapi.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Categories {

    private List<Category> categories;
}
