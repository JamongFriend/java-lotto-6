package lotto.Controller;

import lotto.View.Input;

public class Split {
    public string SpritInput() {
        String[] splitInput = input.split("");
        for(int i = 0; i<splitInput.length; i++){
            int splitInt = Integer.parseInt(splitInput[i]);
            userNum.add(splitInt);
        }
        return userNum;
    }
}
