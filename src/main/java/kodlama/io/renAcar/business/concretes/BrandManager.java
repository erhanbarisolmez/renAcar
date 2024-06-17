package kodlama.io.renAcar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.renAcar.business.abstracts.BrandService;
import kodlama.io.renAcar.core.utilities.mappers.ModelMapperService;
import kodlama.io.renAcar.core.utilities.request.CreateBrandRequest;
import kodlama.io.renAcar.core.utilities.request.UpdateBrandRequest;
import kodlama.io.renAcar.core.utilities.response.GetAllBrandsResponse;
import kodlama.io.renAcar.core.utilities.response.GetByIdBrandsResponse;
import kodlama.io.renAcar.dataAccess.abstracts.BrandRepository;
import kodlama.io.renAcar.entities.concretes.Brand;


@Service
public class BrandManager implements BrandService{
   // iş kuralları
   private BrandRepository brandRepository;
   private ModelMapperService modelMapperService;
    
   public BrandManager(BrandRepository brandRepository, ModelMapperService modelMapperService) {
    this.brandRepository = brandRepository;
    this.modelMapperService = modelMapperService;
}

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse = brands.stream().map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
        return brandsResponse;
    }
    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public GetByIdBrandsResponse getById(int id) {
       
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandsResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandsResponse.class);
        return response;
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);

    }
    
}
