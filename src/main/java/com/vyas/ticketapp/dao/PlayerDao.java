package com.vyas.ticketapp.dao;

import com.vyas.ticketapp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDao extends JpaRepository<Player, Integer> {
    Player findById(int id);
}
