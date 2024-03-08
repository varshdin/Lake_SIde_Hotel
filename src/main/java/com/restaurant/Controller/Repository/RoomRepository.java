package com.restaurant.Controller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.Entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

}
