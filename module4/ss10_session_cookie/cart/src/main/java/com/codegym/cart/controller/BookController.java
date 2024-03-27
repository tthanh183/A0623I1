package com.codegym.cart.controller;

import com.codegym.cart.model.Book;
import com.codegym.cart.model.Cart;
import com.codegym.cart.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/books")
@SessionAttributes("cart")
public class BookController {
    @Autowired
    private IBookService bookService;
    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        return "add";
    }
    @PostMapping("/save")
    public String addBook(@ModelAttribute("book") Book book) {
        bookService.save(book);
        return "redirect:/books";
    }
    @GetMapping("")
    public String showShop(Model model) {
        Iterable<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "index";
    }
    @GetMapping("/add-to-cart/{id}")
    public String addToCart(@PathVariable Long id,@ModelAttribute("cart") Cart cart, @RequestParam(value = "quantity", defaultValue = "1") Integer quantity) {
        Optional<Book> book = bookService.findById(id);
        if(book.isPresent()) {
            cart.addItem(book.get(),quantity);
            return "redirect:/books";
        }else {
            return "error";
        }
    }
    @GetMapping("/buy-now/{id}")
    public String buyNow(@PathVariable Long id,@ModelAttribute("cart") Cart cart, @RequestParam(value = "quantity", defaultValue = "1") Integer quantity) {
        Optional<Book> book = bookService.findById(id);
        if(book.isPresent()) {
            cart.addItem(book.get(),quantity);
            return "cart";
        }else {
            return "error";
        }
    }
    @ExceptionHandler(Exception.class)
    public void handleException(Exception e) {
        System.out.println(e.getMessage());
    }
}
