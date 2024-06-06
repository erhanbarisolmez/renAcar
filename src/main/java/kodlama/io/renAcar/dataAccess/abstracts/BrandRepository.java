package kodlama.io.renAcar.dataAccess.abstracts;

import java.util.List;


import kodlama.io.renAcar.entities.concretes.Brand;


public interface BrandRepository {
    List<Brand> getAll();
}
