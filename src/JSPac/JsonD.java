package JSPac;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class JsonD {


    public static void main(String[] args) throws IOException {
     Women women=new Women();
     women.age=34;
     women.name="Kate";

        StringWriter writer=new StringWriter();

        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(writer,women);
        String result =writer.toString();
        System.out.println(result);


        String jsString="{\"name\":\"Kate\"}";
        StringReader reader=new StringReader(jsString);
        ObjectMapper mapper1=new ObjectMapper();
       Women women1=mapper1.readValue(reader,Women.class);
       
    }
}
