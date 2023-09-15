package TugasNo1;

public class EncapDemo {
    private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int newAge) {
//        if (newAge> 30){
//            age = 30;
//        }else{
//            age = newAge;
//        }
//    }

//    Jawaban untuk nomer 3 yaitu mengubah function agar nilai yang dapat dimasukkan 18 - 30
    public void setAge(int newAge) {
        if (newAge >= 18 && newAge <= 30) {
            age = newAge;
        } else if (newAge < 18) {
            age = 18;
        } else {
            age = 30;
        }
    }
}
