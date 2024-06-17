package kodlama.io.renAcar.webApi.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.renAcar.business.abstracts.BrandService;
import kodlama.io.renAcar.core.utilities.request.CreateBrandRequest;
import kodlama.io.renAcar.core.utilities.request.UpdateBrandRequest;
import kodlama.io.renAcar.core.utilities.response.GetAllBrandsResponse;
import kodlama.io.renAcar.core.utilities.response.GetByIdBrandsResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;
    
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandsResponse getById(@PathVariable int id) {
        return brandService.getById(id);
    }
    

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }

    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
        this.brandService.update(updateBrandRequest);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.brandService.delete(id);
    }
}
