package parkinglot;

import parkinglot.exception.CarPickingUpWithoutTicketException;
import parkinglot.exception.InvalidTicketException;
import parkinglot.exception.TicketAndParkingLotNotMatch;
import parkinglot.model.Car;
import parkinglot.model.ParkingLot;
import parkinglot.model.Ticket;

/**
 * @author yancy3@lenovo.com
 * created on 2019-06-17
 */
public interface PickingUpCarAction {
    Car pickUpCar(Ticket ticket, ParkingLot parkingLot) throws CarPickingUpWithoutTicketException, InvalidTicketException, TicketAndParkingLotNotMatch;
}