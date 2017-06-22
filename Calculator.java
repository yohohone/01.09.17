/**
	класс реализует калькулятор
*/
public class Calculator {
	/**
		результат вычисления
	 */ 
	private int result;

	/**
	 * Суммируем аргументы.
	 * @param params аргументы суммирования.
	 */
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	/**
	 * Получить результат.
	 * @return результат вычесления.
	*/
	public int getResult() {
		return this.result;
	}

	/**
	 * Очистить результат вычисления.
	 */
	public void cleanResult() {
		this.result = 0;
	}

}