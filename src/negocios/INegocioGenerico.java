package negocios;

import java.io.Serializable;
import java.util.ArrayList;

public interface INegocioGenerico {

	public <T> void insertCollection(ArrayList<T> colecao, Class<T> classType);
	
	public <T> T searchByKey(Serializable chave, Class<T> classType);
	
}