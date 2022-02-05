package com.example.springdemo.com.bridgelabz;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    /**
     * Create a Rest Controller to demonstrate
     * the various HTTP Methods and respond
     * hello messages to the User. To begin
     * with show Hello from BridgeLabz
     */

    //localhost:8080/employees
    @GetMapping("/employees")
    public String getEmployee(){
        return "Hello from Bridgelabz";
    }


    /**
     * Make REST Call to show Hello
     * Mark from BridgeLabz
     * @param name
     * @return it returns the message in when am send the request to http.
     */
    @GetMapping("/employees/list")
    public String getMessage(@RequestParam List<String> name){
        return "Hello from "+name+" Bridgelabz";
    }

    //uc3
    /**
     * Make REST Call to show Hello
     * Mark from BridgeLabz
     * - Use GET Request Method and pass name as
     * path variable
     */
    //localhost:8080/employees/Raju
    @GetMapping("/employees/{name}")
    public String getEmployee(@PathVariable List<String> name){
        return "Hello from "+name+" Bridgelabz";
    }

    //uc4
    /***
     * Make REST Call to show Hello Mark
     * Taylor from BridgeLabz
     * - Use POST Request Method and pass first name and
     * last name in the Body
     */

    @PostMapping(value = "/posts")
    public String createPerson(@RequestBody Employee employee){
    return "data : "+ employee.toString();
    }

    /***
     * Make REST Call to show Hello Mark
     * Taylor from BridgeLabz
     */
    //localhost:8080/Update/Joe?lastname=Taylor
    @PutMapping(value = "/Update/{firstname}")
    public String updatePerson(@PathVariable String firstname,@RequestParam String lastname){
        return "data : " +firstname+ " "+lastname;
    }
}