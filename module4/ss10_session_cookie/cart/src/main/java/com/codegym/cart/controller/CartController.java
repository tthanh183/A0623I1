package com.codegym.cart.controller;

import com.codegym.cart.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/cart")
public class CartController {
    @RequestMapping("")
    public String showCart(@SessionAttribute("cart") Cart cart, Model model) {
        model.addAttribute("cart", cart);
        return "cart";
    }
}
