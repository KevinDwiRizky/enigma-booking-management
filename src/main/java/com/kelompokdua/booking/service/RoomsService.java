package com.kelompokdua.booking.service;


import com.kelompokdua.booking.constant.ERoomType;
import com.kelompokdua.booking.constant.ERooms;
import com.kelompokdua.booking.entity.Rooms;
import com.kelompokdua.booking.model.request.RoomsRequest;
import com.kelompokdua.booking.model.request.RoomsSearchRequest;
import com.kelompokdua.booking.model.response.RoomsResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface RoomsService {

    RoomsResponse createRoom(RoomsRequest roomRequest);

//    Page<Rooms> getAllRooms(Integer page, Integer size);

    Page<Rooms> findAllRooms(RoomsSearchRequest request);

    Rooms getByRoomId(String id);

    Rooms updateRoomById(Rooms rooms);

    void deleteRoomById(String id);

    Rooms findUserByName(String name);
    Page<Rooms> getAllAvailableRooms(Integer page, Integer size);
}
