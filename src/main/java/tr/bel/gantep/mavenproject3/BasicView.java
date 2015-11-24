/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.bel.gantep.mavenproject3;

/**
 *
 * @author Omer Faruk KURT
 */
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
    private static final long serialVersionUID = -8305272672098077946L;
     
    private List<Car> cars;
    
    private Short visibilityId;
     
    @ManagedProperty("#{carService}")
    private CarService service;
 
    @PostConstruct
    public void init() {
        visibilityId=1;
        cars = service.createCars(10);
    }
     
    public List<Car> getCars() {
        return cars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }

    public Short getVisibilityId() {
                return visibilityId;
    }

    public void setVisibilityId(Short visibilityId) {
        this.visibilityId = visibilityId;
    }
    
}