package daos;

public class CategoriasDAO
{
    public static java.util.List<model.Categoria> findAll()
    {
        java.util.List<model.Categoria> arr = new java.util.ArrayList<model.Categoria>();
        for(Object o : daos.AbstractDAO.findAllByHQL("from Categoria"))
        {
            arr.add((model.Categoria)o);
        }
        return arr;
    }
}
