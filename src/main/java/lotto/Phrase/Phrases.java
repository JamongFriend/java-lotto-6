package lotto.Phrase;

public enum Phrases {
    purchaseAmountPhrase("구입 금액을 입력해 주세요."),
    purchaseCountPhrase("개를 구매했습니다.");
//    public static final String winningNumPhrase = "당첨 번호를 입력해 주세요.";
//    public static final String bonusNumPharse = "보너스 번호를 입력해 주세요.";
//    public static final String statisticsPharse = 9"당첨 통계";
//    public static final String Line = "---";
//    public static final String correctThreeNum = "3개 일치 (5,000원) - ";
//    public static final String correctFourNum = "4개 일치 (50,000원) - ";
//    public static final String correctFiveNum = "5개 일치 (1,500,000원) - ";
//    public static final String correctFiveBonusNum = "5개 일치, 보너스 볼 일치 (30,000,000원) - ";
//    public static final String correctSixNum = "6개 일치 (2,000,000,000원) - ";
//    public static final String countPhrase = "개";
//    public static final String FinalRevenuePhrase = "총 수익률은 ";
//    public static final String FinalRevenuePhraseTwo = "%입니다.
    final String text;

    Phrases(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}