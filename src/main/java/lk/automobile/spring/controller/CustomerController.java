package lk.automobile.spring.controller;

import lk.automobile.spring.bo.CustomerBOImpl;
import lk.automobile.spring.dto.CustomerDTO;
import lk.automobile.spring.util.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

/**
 * author  Yasith C Bandara
 * created 1/18/2023 - 5:59 PM
 * project Automobile-Service-WebApp
 */

@Controller
public class CustomerController {

    @GetMapping
    public ResponseUtil getAllCustomers(){
        return new ResponseUtil(
                "200",
                "Success",
                new CustomerBOImpl().getAllCustomers()
        );
    }
}
