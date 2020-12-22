package JSPac;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonAutoDetect
public class Women {
    public String name;
    @JsonIgnore
    public int age;
    Women(){

    }
}
