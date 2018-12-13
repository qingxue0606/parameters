 package cn.websocket.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.websocket.utils.Isbn;
import cn.websocket.utils.IsbnEditor;
import cn.websocket.vo.Person;

/**
 * @author xiang
 * @date 2018/12/13
 */
 @Controller
public class HelloController {
     
     
     @RequestMapping("/home")
     @ResponseBody
     public String home() {
         return "ok";
     }
     //http://localhost:8080/books/9781-1234-1111
     @RequestMapping(value = "/books/{isbn}", method = RequestMethod.GET)
     @ResponseBody
     public String  getBook(@PathVariable Isbn isbn) {
         return isbn.getIsbn();
     }

     @InitBinder
     public  void initBinder(WebDataBinder binder) {
         binder.registerCustomEditor(Isbn.class, new IsbnEditor());
     }
     
     
     
     //http://localhost:8080/date?date=2018-02-23
     @RequestMapping("/date")
     @ResponseBody
     public String date(Date date) {
         return date.toString();
     }
     
     
   //http://localhost:8080/date?date=2018-02-23
     @RequestMapping("/person")
     @ResponseBody
     public String person(Person person) {
         return person.toString();
     }
     
     
     
     
}
