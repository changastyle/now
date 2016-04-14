package controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class RestControlador
{
    @RequestMapping("/saludar")
    public String saludar()
    {
        return "Hola, como estas??";
    }
    //<editor-fold desc="CATEGORIAS:">
    @RequestMapping(value = "/categorias", method = RequestMethod.GET)
    public java.util.List<model.Categoria> findCategorias()
    {
        return daos.CategoriasDAO.findAll();
    }
    //</editor-fold>
    
    //<editor-fold desc="NEGOCIOS:">
    @RequestMapping(value = "negocios" , method = RequestMethod.GET)
    public java.util.List<model.Negocio> findNegocios()
    {
        return daos.NegociosDAO.findAll();
    }
    //</editor-fold>
    
    
    @RequestMapping(method = RequestMethod.POST ,value="/web/upload")
    public boolean provideUploadInfo(@RequestParam("nombre") String name,@RequestParam("file") MultipartFile file) 
    {
        boolean copio = false;
        File rootFolder = new File("C:\\temp");
        if (!file.isEmpty()) 
        {
            System.out.println("RECIBI:" + name);
            try 
            {
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(rootFolder + File.separator + name)));
                FileCopyUtils.copy(file.getInputStream(), stream);
                stream.close();
                copio = true;
            }
            catch (Exception e) 
            {
                copio = false;
                e.printStackTrace();
                 System.out.println("salio por exception: " +e.toString() );
            }
        }
        else 
        {
                System.out.println("salio por el else");
                copio = false;
        }

	return copio;
        //System.out.println("pwd: " + System.getProperty("user.dir"));
           /* File rootFolder = new File("C:\\temp");
            
            System.out.println("rootFolder existe: " + rootFolder.exists());
            
            List<String> fileNames = Arrays.stream(rootFolder.listFiles()).map(f -> f.getName()).collect(Collectors.toList());

            model.addAttribute("files",Arrays.stream(rootFolder.listFiles()).sorted(Comparator.comparingLong(f -> -1 * f.lastModified())).map(f -> f.getName()).collect(Collectors.toList()));

            return "uploadForm";*/
    }
    
}
