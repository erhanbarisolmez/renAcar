 package kodlama.io.renAcar.core.utilities.mappers;

import org.modelmapper.ModelMapper;


public interface ModelMapperService {

     
     ModelMapper forResponse();
     ModelMapper forRequest();
}