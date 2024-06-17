package kodlama.io.renAcar.business.abstracts;

import java.util.List;

import kodlama.io.renAcar.core.utilities.request.CreateBrandRequest;
import kodlama.io.renAcar.core.utilities.request.UpdateBrandRequest;
import kodlama.io.renAcar.core.utilities.response.GetAllBrandsResponse;
import kodlama.io.renAcar.core.utilities.response.GetByIdBrandsResponse;


public interface BrandService {

    List<GetAllBrandsResponse> getAll();
    GetByIdBrandsResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
    
    
}
