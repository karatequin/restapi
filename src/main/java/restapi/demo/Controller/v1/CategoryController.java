package restapi.demo.Controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.demo.Model.Categories;
import restapi.demo.Service.CategoryService;

// i modsætning til normal controller, returnere en RestController ikke et view (html side). Den returnere i stedet
// Returnere vi en værdi som vi får fra mapping metode.
@RestController
@RequestMapping("/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // HttpStatus.OK giver tilbage enten en 200 status for ok eller 400 for fejl.
    @GetMapping
    public ResponseEntity<Categories> getAllCategories(){
        return new ResponseEntity<>(new Categories(categoryService.getAllCategories()), HttpStatus.OK);
    }
}
