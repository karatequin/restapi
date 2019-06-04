package restapi.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import restapi.demo.Model.Category;
import restapi.demo.Repositories.CategoryRepository;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run (String... args) throws Exception{

        Category fodboldhold = new Category();
        fodboldhold.setName("fodboldhold");

        Category biler = new Category();
        biler.setName("biler");

        categoryRepository.save(fodboldhold);
        categoryRepository.save(biler);

        System.out.println("Antal objekter er gemt: " + categoryRepository.count());





    }
}
