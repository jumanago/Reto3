package usa.ciclo3.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.ciclo3.model.Categoria;
import usa.ciclo3.repository.CategoriaRepository;

/**
 *
 * @author ASUS M509
 */
@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    public List<Categoria> getAll(){
        return categoriaRepository.getAll();
    }
    
    public Optional<Categoria> getCategoria(int id){
        return categoriaRepository.getCategoria(id);
    }
    
    public Categoria save(Categoria c){
        if(c.getId()==null){
            return categoriaRepository.save(c);            
        }else{
            Optional<Categoria> cataux=categoriaRepository.getCategoria(c.getId());
            if(cataux.isEmpty()){
                return categoriaRepository.save(c);
            }else{
                return c;
            }
        }
    }
}
