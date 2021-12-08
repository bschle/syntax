package Auftrag4;


public class NullPointerExample {

    public static void main(String[] args) {

        int numberToCheck = 0;
        Result result = isNumberBiggerThanZero(numberToCheck);
        if (result.isRight()){
            System.out.println("The number was bigger than zero");
        }
        else if (!result.isRight()){
            System.out.println("The number was lower or equals than zero");
        }
        }


    public static Result isNumberBiggerThanZero(int number){
        Result result = null;
        if (number > 0) {
            result = new Result();
            result.setRight(true);
        } else if (number <= 0){
            result = new Result();
            result.setRight(false);
        }
        return result;

    }
}

