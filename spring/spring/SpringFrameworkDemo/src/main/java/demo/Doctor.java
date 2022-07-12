package demo;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;
    public void assist(){System.out.println("Doctor is assisting");}

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean name method is called");
    }

    @PostConstruct
    public void postConstruct(){ // this method is called before object creation
        System.out.println("post construct method is called");
    }
}




