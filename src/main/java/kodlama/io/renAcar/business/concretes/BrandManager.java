package kodlama.io.renAcar.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.renAcar.business.abstracts.BrandService;
import kodlama.io.renAcar.dataAccess.abstracts.BrandRepository;
import kodlama.io.renAcar.entities.concretes.Brand;


@Service
public class BrandManager implements BrandService{
   // iş kuralları
   private BrandRepository brandRepository;
    
   public BrandManager(BrandRepository brandRepository) {
    this.brandRepository = brandRepository;
}
    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
    
}
