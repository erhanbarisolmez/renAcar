package kodlama.io.renAcar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.renAcar.entities.concretes.Brand;


public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
