package Book_V1;

public interface Store_interface {
	public boolean checkFull();

	public boolean checkEmpty();

	public void add(Object Obj);

	public void edit(String Id, String Name, double Price);

	public void delete(String Id);

	public void find(String Id);

	public void list();
}
