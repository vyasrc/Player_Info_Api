package com.vyas.ticketapp.service;

import com.vyas.ticketapp.dao.PlayerDao;
import com.vyas.ticketapp.model.Player;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerDao playerDao;
    public Player printPlayerInfo(int id) {
        return playerDao.findById(id);
    }

    public Player updatePlayerInfo(int id, Player player) {
        Player existingPlayer = playerDao.findById(id);

        Instant currentTimestamp = Instant.now();

        if (player.getNumber() != null){
            existingPlayer.setNumber(player.getNumber());
        }

        if (player.getStatus() != null){
            existingPlayer.setStatus(player.getStatus());
        }

        existingPlayer.setUpdated(currentTimestamp);

        playerDao.save(existingPlayer);

        return existingPlayer;
    }
}
