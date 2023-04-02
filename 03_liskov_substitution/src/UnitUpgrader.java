public class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;
        apartment.incrementRoomCount(1);
    }
}
