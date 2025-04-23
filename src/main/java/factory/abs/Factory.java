package factory.abs;

public interface Factory {

	<T> T create(String name);
}
