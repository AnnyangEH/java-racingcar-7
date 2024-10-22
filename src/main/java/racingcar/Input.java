package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Input {

	public String[] inputCarNames() {

		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		String[] carNames = splitCarNames(Console.readLine());
		Validation.validateCarNames(carNames);
		return carNames;
	}

	private String[] splitCarNames(String input) {
		return input.split(",");
	}

	public int inputTryCounts() {
		System.out.println("시도할 횟수는 몇 회인가요?");
		String input = Console.readLine();
		return 0;
	}
}
