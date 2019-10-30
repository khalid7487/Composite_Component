
package bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class Person extends Programmer{
    public Person(){
        super("Md.","Khalid","Jounior","HTML","CSS","JavaScript","Oracle","Java","XML","Android");
    }
}
