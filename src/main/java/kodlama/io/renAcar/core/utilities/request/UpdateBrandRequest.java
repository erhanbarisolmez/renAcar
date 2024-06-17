package kodlama.io.renAcar.core.utilities.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UpdateBrandRequest
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
    private int id;
    private String name;
    
}