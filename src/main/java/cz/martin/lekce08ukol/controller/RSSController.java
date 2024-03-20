package cz.martin.lekce08ukol.controller;

import cz.martin.lekce08ukol.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSSController {

    @GetMapping("scifi")
    public String getScifi() throws Exception {
        return Utils.readFromFile("scifi");
    }

    @GetMapping("romantic")
    public String getRomantic(){
        return Utils.readFromFile("romantic");
    }

    @GetMapping("historic")
    public String getHistoric(){
        return Utils.readFromFile("historic");
    }

}
