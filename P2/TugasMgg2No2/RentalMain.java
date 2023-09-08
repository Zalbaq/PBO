package TugasMgg2No2;

public class RentalMain {
    public static void main(String[] args) {
        VideoRentalGameStore rental = new VideoRentalGameStore();

        rental.setPlayerRentGame(11, "Daffa", "Mortal Kombat", 30, 10000);
        rental.setPlayerRentGame(22, "Ihza", "Doraemon", 15, 15000);
        rental.setPlayerRentGame(33, "Nadila", "Dragon Ball Z", 20, 10000);
        rental.setPlayerRentGame(44, "Doni", "Upin Ipin of War", 60, 10000);
        rental.setPlayerRentGame(55, "Yanto", "Digimon", 40, 10000);
        System.out.println();
        rental.getMemberInfo(11);
        rental.getMemberInfo(22);
        rental.getMemberInfo(33);
        rental.getMemberInfo(44);


    }
}
