package case_study.repository;

import case_study.model.Facility.Facility;
import case_study.model.Facility.House;
import case_study.model.Facility.Room;
import case_study.model.Facility.Villa;

import java.util.Map;

public interface IFacilityRepository {
    void addRoomRepository(Room room);

    void addVillaRepository(Villa villa);

    void addHouseRepository(House house);

    Map<Facility, Integer> getAll();
}
