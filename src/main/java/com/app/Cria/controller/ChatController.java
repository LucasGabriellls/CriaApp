package com.app.Cria.controller;

import com.app.Cria.domain.Chat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @PostMapping()
    public ResponseEntity<Chat> startService(@RequestBody Chat chat) {
        chat.setMessage("Olá! O CEI Hilca de Sá Teixeira agradece seu contato. Como podemos ajudar hoje?");
        chat.setSendDate(LocalDateTime.now());
        chat.setRead(false);

        return ResponseEntity.status(HttpStatus.CREATED).body(chat);
    }
}
