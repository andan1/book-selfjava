package 연습문제;

import java.time.LocalDateTime;

public class practice301 {
    public static void main(String[] args) {
        final int SEASON_SPRING = 0;
        final int SEASON_SUMMER = 1;
        final int SEASON_FALL = 2;
        final int SEASON_WINTER = 3;

        String[] seasons = new String[]{
                "봄", "여름", "가을", "겨울"
        };

        seasons = new String[]{
                "Spring", "Summer", "Fall", "Winter"
        };
        
        LocalDateTime today = LocalDateTime.now();
        int month = today.getMonthValue();

		String msg ="%d월은(는) %s입니다.";

		if (3 <= month && month <= 5) {
			msg = msg.formatted(month, seasons[SEASON_SPRING]);
		} else if (6 <= month && month <= 8) {
			msg = msg.formatted(month, seasons[SEASON_SUMMER]);
		} else if (9 <= month && month <= 11) {
			msg = msg.formatted(month, seasons[SEASON_FALL]);
		} else {
			msg = msg.formatted(month, seasons[SEASON_WINTER]);
		}

	System.out.println(msg);
    }
}
