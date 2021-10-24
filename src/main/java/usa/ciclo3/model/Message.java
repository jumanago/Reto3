package usa.ciclo3.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author ASUS M509
 */

@Entity
@Table(name="mensaje")
public class Message implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
