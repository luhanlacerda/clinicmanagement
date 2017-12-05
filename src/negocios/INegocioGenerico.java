package negocios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface INegocioGenerico {

	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType) throws Exception;
	
	public <T> T searchByKey(Serializable chave, Class<T> classType) throws Exception;
	
	public <T> List<T> getAll(Class<T> classType) throws Exception;
	
}