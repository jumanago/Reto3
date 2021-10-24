package usa.ciclo3.repository;

import java.util.List;
import java.util.Optional;
//import org.apache.el.stream.Optional;
import usa.ciclo3.repository.crud.FarmCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ciclo3.model.Farm;


/**
 *
 * @author Juan Manuel Naranjo
 */
@Repository
public class FarmRepository {
    @Autowired
    private FarmCrudRepository farmCrudRepository;
    public List<Farm> getAll(){
        return (List<Farm>) farmCrudRepository.findAll();        
    }
    
    public Optional<Farm> getFarm(int id){
        return farmCrudRepository.findById(id);
    }
    
    public Farm save(Farm f){
        return farmCrudRepository.save(f);
    }
           
}
