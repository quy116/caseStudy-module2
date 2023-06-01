package case_study.repository;

import case_study.model.Facility.Facility;
import case_study.model.Facility.House;
import case_study.model.Facility.Room;
import case_study.model.Facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Facility, Integer> mapList = new LinkedHashMap<>();

    @Override
    public void addRoomRepository(Room room) {
        mapList.put(room, 0);
    }

    @Override
    public void addVillaRepository(Villa villa) {
        mapList.put(villa, 0);
    }

    @Override
    public void addHouseRepository(House house) {
        mapList.put(house, 0);
    }

    @Override
    public Map<Facility, Integer> getAll() {
        return mapList;
    }
}
