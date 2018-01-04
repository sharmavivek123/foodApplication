package com.example;


import jnr.ffi.annotations.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;

@RestController
public class MenuController {
    @Autowired
    MenuRespository menuRepository;

@GetMapping("/")
        public List<Menu_card>getAllItems(){
    List<Menu_card>list=new ArrayList<Menu_card>();
    menuRepository.findAll().forEach(list::add);
    return list;
        }
@RequestMapping(method = RequestMethod.POST,path="/")
public void addItemToMenu(@RequestBody Menu_card menu_card){
            menuRepository.save(menu_card);
}

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id) {
        menuRepository.delete(id);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Menu_card findById(@PathVariable("id") int id){
    return menuRepository.findOne(id);
    }

/*@RequestMapping(value = "/",method = RequestMethod.PUT)
Menu_card update(@RequestBody Menu_card menu_card){
        return menuRepository.updateMenu_card(menu_card);
}
*/
}
