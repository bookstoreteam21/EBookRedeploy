package com.team.bookstore.Controllers;

import com.team.bookstore.Dtos.Responses.APIResponse;
import com.team.bookstore.Services.Customer_BookService;
import com.team.bookstore.Services.EBookService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ebook")
public class EBookController {
    @Autowired
    EBookService eBookService;
    @Autowired
    Customer_BookService customerBookService;
    @GetMapping("/all")
    public ResponseEntity<APIResponse<?>> getAllEBooks(){
        return ResponseEntity.ok(APIResponse.builder().code(200).message("OK").result(eBookService.getAllEBook()).build());
    }
    @GetMapping("/find")
    public ResponseEntity<APIResponse<?>> findEBooksByKeyword(@RequestParam String keyword){
        return ResponseEntity.ok(APIResponse.builder().code(200).message("OK").result(eBookService.findEBookByKeyword(keyword)).build());
    }
    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/read")
    public ResponseEntity<APIResponse<?>> readEbook(@RequestParam int book_id){
        return ResponseEntity.ok(APIResponse.builder().code(200).message("OK").result(eBookService.readEBook(book_id)).build());
    }
    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/mine")
    public ResponseEntity<APIResponse<?>> getMyPurchaseBook(){
        return ResponseEntity.ok(APIResponse.builder().code(200).message("OK").result(eBookService.getMyPurchasedEBooks()).build());
    }
    @GetMapping("/of-category")
    public ResponseEntity<APIResponse<?>> getAllEBooksOfCategory(@RequestParam int category_id){
        return ResponseEntity.ok(APIResponse.builder().code(200).message("OK").result(eBookService.getEBooksOfCategory(category_id)).build());
    }

    @GetMapping("/discount")
    public ResponseEntity<APIResponse<?>> getAllDiscountEbook(){
        return ResponseEntity.ok(APIResponse.builder().code(200).message("OK").result(eBookService.getAllDiscountBook()).build());
    }
}
