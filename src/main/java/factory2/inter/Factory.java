package factory2.inter;


public interface Factory {
	void init(String pkgName);
	<T> T create(String name);
}
