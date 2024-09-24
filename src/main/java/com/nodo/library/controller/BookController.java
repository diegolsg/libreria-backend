package com.nodo.library.controller;

import com.nodo.library.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/book")
public class BookController {
    @GetMapping("/{title}/{autor}/{year}")
    public String showBook(@PathVariable String title,
                           @PathVariable String autor,
                           @PathVariable String year,
                           Model model){
        Book book = new Book(title,autor,year);
        model.addAttribute("book", book);
        return "book";
    }
}
