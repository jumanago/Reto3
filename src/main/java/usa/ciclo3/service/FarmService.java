package usa.ciclo3.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.ciclo3.model.Farm;
import usa.ciclo3.repository.FarmRepository;

/**
 *
 * @author ASUS M509
 */
@Service
public class FarmService {
    @Autowired
    private FarmRepository farmRepository;
    
    public List<Farm> getAll(){
        return farmRepository.getAll();
    }
    
    public Optional<Farm> getFarm(int id){
        return farmRepository.getFarm(id);
    }
    
    public Farm save(Farm p){
        if(p.getId()==null){
            return farmRepository.save(p);            
        }else{
            Optional<Farm> farmaux=farmRepository.getFarm(p.getId());
            if(farmaux.isEmpty()){
                return farmRepository.save(p);
            }else{
                return p;
            }
        }
    }
}
