package hu.unideb.inf.model;
import java.util.List;

public interface UsersDAO extends AutoCloseable {
    public void saveUser(Users a);
    public void deleteUser(Users a);
    public void updateUser(Users a);

    public List<Users> getPersons();
}
