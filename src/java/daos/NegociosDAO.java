package daos;

import java.util.ArrayList;
import java.util.List;
import model.Negocio;

public class NegociosDAO
{
    public static List<Negocio> findAll()
    {
        List<Negocio> arr = new ArrayList<Negocio>();
        
        for(Object o : daos.AbstractDAO.findAllByHQL("from Negocio"))
        {
            arr.add((Negocio)o);
        }
        
        return arr;
    }
}
