package Overriding;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManagers =  new BaseCreditManager[]{
                new TeacherCreditManager(),
                new FarmerCreditManager(),
                new StudentCreditManager()
        };

        for(BaseCreditManager creditManager : baseCreditManagers){
            System.out.println(creditManager.calculate(250000));
        }
    }
}
