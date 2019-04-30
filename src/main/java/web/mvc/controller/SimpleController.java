package web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.mvc.service.OriginService;

@RestController
public class SimpleController {

  @Autowired
  OriginService originService;

  /**
   * RestAPI テストAPI
   * 
   * @return String
   */
  @RequestMapping("/greeting")
  public String greeting() {
    originService.findAll();
    return "Hello World";
  }
}
