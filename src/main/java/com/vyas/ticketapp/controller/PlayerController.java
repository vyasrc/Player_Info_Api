package com.vyas.ticketapp.controller;

import com.vyas.ticketapp.model.Player;
import com.vyas.ticketapp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("print")
    public Player printPlayerInfo(@RequestParam String id){
        return playerService.printPlayerInfo(Integer.parseInt(id));
    }

    @PostMapping("/update/{id}")
    public Player updatePlayerInfo(@PathVariable String id, @RequestBody Player player){

        return playerService.updatePlayerInfo(Integer.parseInt(id), player);

    }
}
