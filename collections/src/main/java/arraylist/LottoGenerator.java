package arraylist;

import interfaces.IIntList;

import java.util.Random;


public class LottoGenerator {
    public static IIntList generateLottoNumbers() {
        IIntList lottoNumbers = new IntArrayList();
        Random random = new Random();
        int lottozahl = 0;
        for (int i = 0; i < 6; i++) {
            lottozahl = random.nextInt(42);
            lottoNumbers.add(lottozahl);
        }
        return lottoNumbers;
    }

}
