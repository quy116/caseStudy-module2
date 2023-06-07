package case_study.repository;

import case_study.model.Facility.Facility;
import case_study.model.Facility.House;
import case_study.model.Facility.Room;
import case_study.model.Facility.Villa;
import case_study.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository {
    private static  Map<Facility, Integer> mapList = new LinkedHashMap<>();

    static {
        mapList.put(new House("HO-0001", "Rent House", 100, 1.0, 6, "Day", "VIP", 2), 0);
        mapList.put(new Room("RO-0001", "Rent Room", 35, 6000000.0, 4, "Month", "Free Cleaner"), 5);
        mapList.put(new Villa("VL-0001", "Rent Villa", 300, 100000.00, 12, "Day", "Standard", 50, 3), 0);
    }

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
    public void deleteFacilityRepository(Facility facility) {
        mapList.remove(facility);
    }


    @Override
    public Map<Facility, Integer> getAll() {
        return mapList;
    }

    public void countKey(String code) {
        Set<Facility> facilitySet = mapList.keySet();
        for (Facility s : facilitySet) {
            if (code.equals(s.getCode())) {
                mapList.put(s, mapList.get(s) + 1);
            }
        }
    }

}
