public class Counter implements AutoCloseable {
	private int count;

	public Counter() {
		count = 0;
	}

	public void add() {
		count++;
	}

	public int getCount() {
		return count;
	}

	@Override
	public void close() throws Exception {
		if (count > 0) {
			throw new IllegalStateException("Счетчик не был корректно закрыт. Все поля должны быть добавлены.");
		}
	}
}
