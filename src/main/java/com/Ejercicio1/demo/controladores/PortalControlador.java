/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ejercicio1.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author nicolas
 */
@Controller
public class PortalControlador {

    @GetMapping("/")
    public String index() {

        return "index.html";
    }

}
