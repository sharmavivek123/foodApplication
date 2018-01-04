package com.example;


import jnr.ffi.annotations.In;
import net.bytebuddy.asm.Advice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;

@RestController
public class MenuController {
    ModelMapper modelMapper = new ModelMapper();
    @Autowired
    MenuRespository menuRepository;

    @Autowired
    MenuRepositoryelastic menuRepositoryelastic;

@RequestMapping("/")
        public List<Menucardelasticsearch> getAllItems(){
    List<Menucardelasticsearch> arrayList=new ArrayList<Menucardelasticsearch>();
     menuRepositoryelastic.findAll().forEach(arrayList::add);
    return arrayList;
}
@RequestMapping(method = RequestMethod.POST,path="/")
public void addItemToMenu(@RequestBody Menu_card menu_card){
            menuRepository.save(menu_card);
            Menucardelasticsearch menucardelasticsearch=modelMapper.map(menu_card,Menucardelasticsearch.class);
            menuRepositoryelastic.save(menucardelasticsearch);
}
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") Integer id) {
        menuRepository.delete(id);
        menuRepositoryelastic.delete(id);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Menucardelasticsearch findById(@PathVariable("id") int id){
    return menuRepositoryelastic.findOne(id);
    }

/*@RequestMapping(value = "/",method = RequestMethod.PUT)
Menu_card update(@RequestBody Menu_card menu_card){
        return menuRepository.updateMenu_card(menu_card);
}
*/
@RequestMapping(method = RequestMethod.GET,value="/{price}")
    public List<Menucardelasticsearch>getitems() {
    List<Menucardelasticsearch> arrayList=new ArrayList< findByPriceBetween(int from, int to)>();
    return arrayList;
}
}
