package com.restaurant.Services;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.restaurant.Controller.Repository.RoomRepository;
import com.restaurant.Entities.Room;

@Service
public class RoomService implements RommerServiceImplement{
	
	@Autowired
	private RoomRepository roomRepository;
	
	public Room addNewRoom(MultipartFile file,String roomType, BigDecimal roomPrice) throws IOException, SerialException, SQLException
	{
		Room room=new Room();
		room.setRoomType(roomType);
		room.setRoomPrice(roomPrice);
		
		if(!file.isEmpty())
		{
			byte[] photoBytes=file.getBytes();
			Blob photoBlob=new SerialBlob(photoBytes);
			room.setPhoto(photoBlob);
			
		}
		
		return roomRepository.save(room);
	}

}
