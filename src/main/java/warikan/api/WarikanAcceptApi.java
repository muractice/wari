package warikan.api;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WarikanAcceptApi {

    @RequestMapping(value = "/warikan",method = RequestMethod.POST)
    public Map invoke(Request request){
        Map<String,Object> res = new HashMap<>();
        res.put("hoge",0);
        return res;
    }
}
