package TugasMgg2No2;

import java.util.ArrayList;

public class VideoRentalGameStore {
    private ArrayList<Rental> rentalList = new ArrayList<Rental>();
    int index = 0;
    
    public void setPlayerRentGame(int memberId, String memberName, String gameName, int duration, double price) {
        Rental memberRental = new Rental();
        memberRental.setMemberId(memberId);
        memberRental.setMemberName(memberName);
        memberRental.setGameName(gameName);
        memberRental.setDuration(duration);
        memberRental.setPrice(price);
        rentalList.add(index,memberRental);
        index++;
    }

    private double calculateTotalPrice(int duration, double price) {
        return duration * price;
    }

    public void getMemberInfo(int memberId) {
        boolean found = false;
        for (Rental rental : rentalList) {
            if (rental.getMemberId() == memberId) {
                System.out.println("Member Id\t: " + rental.getMemberId());
                System.out.println("Member Name\t: " + rental.getMemberName());
                System.out.println("Game Name\t: " + rental.getGameName());
                System.out.println("Duration\t: " + rental.getDuration() + " minutes");
                System.out.println("Price\t\t: " + rental.getPrice() + " IDR");
                System.out.println("Total Price\t: " + calculateTotalPrice(rental.getDuration(), rental.getPrice()));
                System.out.println("==========================================================");
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println("Member dengan ID " + memberId + " tidak ditemukan.");
        }
    }

}
