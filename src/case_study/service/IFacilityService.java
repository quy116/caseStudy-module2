package case_study.service;

import case_study.model.Facility.Facility;

import java.util.Map;

public interface IFacilityService {
    void addRoomService();
    void addVillaService();
    void addHouseService();
    void deleteService();
    void displayFacility();
    String rentalType();
    String roomStandard();
    String freeService();
    void displayFacilityNumber();
}
