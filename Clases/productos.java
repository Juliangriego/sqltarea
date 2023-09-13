package Clases;

public class productos{
    private String cod;
    private String nombre;
    private String descripcion;
    private int precios;

    //Constructores
    public productos() {}
    public productos(String c)                             {this.cod=c;}
    public productos(String c, String n)                   {this.cod=c;this.nombre=n;}
    public productos(String c,String n,int p)              {this.cod=c;this.nombre=n;this.precios=p;}
    public productos(String c, String n, String d, int p)  {this.cod=c;this.nombre=n;this.descripcion=d;this.precios=p;}

    //Setters
    public void     setCod          (String c)      {this.cod = c;}
    public void     setNombre       (String n)      {this.nombre = n ;}
    public void     setDescripcion  (String d)      {this.descripcion =d;}
    public void     setPrecio       (int p)         {this.precios=p;}

    //Getters
    public String   getCodigo()                     {return this.cod;}
    public String   getNombreProducto()             {return this.nombre;}
    public String   getDescripcion()                {return this.descripcion;}
    public int      getPrecios()                    {return this.precios;}

}