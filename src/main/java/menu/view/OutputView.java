package menu.view;

import menu.model.DayOfTheWeek;

import java.text.MessageFormat;
import java.util.List;

public class OutputView {

    private static final String LUNCH_MENU_RECOMMEND_MESSAGE = "점심 메뉴 추천을 시작합니다.";
    private static final String READ_COACH_NAME_MESSAGE = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String CANNOT_EAT_FOODS_BY_COACH_MESSAGE = "(이)가 못 먹는 메뉴를 입력해 주세요.";
    private static final String RECOMMEND_MENU_RESULT_MESSAGE = "메뉴 추천 결과입니다.";
    private static final String RESULT_MESSAGE_FORMAT = "[ {0} ]";
    private static final String SPLIT_MESSAGE = "구분";
    private static final String JOIN_DELIMITER = " | ";
    private static final String CATEGORY_MESSAGE = "카테고리";

    public void printLunchMenuRecommendMessage() {
        printMessage(LUNCH_MENU_RECOMMEND_MESSAGE);
    }

    public void printReadCoachNameMessage() {
        printBlankLine();
        printMessage(READ_COACH_NAME_MESSAGE);
    }

    public void printCannotEatFoodsByCoachMessage(String coachName) {
        printBlankLine();
        printMessage(coachName + CANNOT_EAT_FOODS_BY_COACH_MESSAGE);
    }

    public void printMenuRecommendResultMessage() {
        printBlankLine();
        printMessage(RECOMMEND_MENU_RESULT_MESSAGE);
    }
    public void printDayOfTheWeek(List<String> daysOfTheWeek) {
        daysOfTheWeek.add(0, SPLIT_MESSAGE);
        String formattedDayOfTheWeek = MessageFormat.format(
                RESULT_MESSAGE_FORMAT, String.join(JOIN_DELIMITER, daysOfTheWeek));
        printMessage(formattedDayOfTheWeek);
    }

    private void printBlankLine() {
        System.out.println();
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}
