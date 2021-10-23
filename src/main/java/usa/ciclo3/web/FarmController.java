package usa.ciclo3.web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import usa.ciclo3.model.Farm;
import usa.ciclo3.service.FarmService;

/**
 *
 * @author Juan Manuel Naranjo
 */
@RestController
@RequestMapping("/api/farm")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.POST})
public class FarmController {
    @Autowired
    private FarmService farmService;
    
    @GetMapping("/all")
    public List<Farm> getFarms(){
        return farmService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Farm> getFarm(@PathVariable("id") int id){
        return farmService.getFarm(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Farm save(@RequestBody Farm p){
        return farmService.save(p);
    }
}
