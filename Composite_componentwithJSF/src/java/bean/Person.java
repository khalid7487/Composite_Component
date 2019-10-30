
package bean;

import javax.annotation.ManagedBean;
import javax.faces.bean.ApplicationScoped;


@ManagedBean
@ApplicationScoped
public class Person extends Programmer{
    public Person(){
        super("Md.","Khalid","Jounior","HTML","CSS","JavaScript","Oracle","Java","XML","Android");
    }
}
