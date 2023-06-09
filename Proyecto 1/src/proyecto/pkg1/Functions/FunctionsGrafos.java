/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.Functions;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;
import proyecto.pkg1.Grafo.Grafo;
import proyecto.pkg1.Grafo.ListaVertex;
import proyecto.pkg1.Grafo.NodoVertex;
import proyecto.pkg1.Grafo.User;

/**
 * Clase que define metodos adicionales para implementar la clase grafo y visualizar su contenido 
 * @author Anabella Jaua
 */
public class FunctionsGrafos {
    
    //Variables declaradas como atributos de la clase para facilitar el manejo de los metodos creados 
    Grafo grafoAux = new Grafo();
    LeerArchivo f = new LeerArchivo();
    FunctionsTXT use = new FunctionsTXT();
    String infoGrafo = f.leertxt("test\\TxtProyecto.txt");
    String[] users = use.getUsuarios(infoGrafo);
    String[] relaciones = use.getRelaciones(infoGrafo);
    
    /**
     * Metodo que crea un grafo nuevo a partir de la informacion guardada en el TXT
     * @param users, lista de usuarios guardados
     * @param relaciones, lista de relaciones guardadas
     * @return Grafo nuevo con la informacion del TXT
     */
    public Grafo crearGrafo(String[] users, String[] relaciones){
        for (int i = 1; i < users.length; i++) {
            String[] info = users[i].trim().split(",");
            String username = info[1].trim();
            int id = Integer.parseInt(info[0].trim());
            User user1 = new User(username, id);
            grafoAux.addVertex(user1);}
        for (int j = 1; j < relaciones.length; j++) {
                String[] relationships = relaciones[j].trim().split(",");
                int id1 = Integer.parseInt(relationships[0].trim());
                int id2 = Integer.parseInt(relationships[1].trim());
                int years = Integer.parseInt(relationships[2].trim());
                ListaVertex usersGrafo = grafoAux.getUserList();
                User idName1 = getUsuarioByID(usersGrafo, id1);
                User idName2 = getUsuarioByID(usersGrafo, id2);
                if (idName1 != null && idName2 != null){
                    grafoAux.addEdge(idName1, idName2, years);
                }else{
                    JOptionPane.showMessageDialog(null, "error");
                   }
        } return grafoAux;
        
        }
      
     /**
      * Metodo que permite obtener un usuario a partir de su id
      * @param allUsers, lista de todos los usuarios del grafo
      * @param id, id del usuario que se desea buscar
      * @return User correspondiente al ID ingresado, o null si el usuario no existe 
      */
    public User getUsuarioByID(ListaVertex allUsers, int id){
        User name = null;
        for (NodoVertex i = allUsers.getHead(); i != null; i=i.getNext()) {
            User j = (User) i.getElement();
            int idCompare = j.getUserID();
            if(idCompare == id){
                return j;
            } 
        } return name;
    }

    /**
     * Metodo que permite validar el usuario que se quiere añadir al grafo
     * @param grafo actual
     * @param idUser1, id del usuario nuevo
     * @param username1, username del usuario nuevo
     * @return Valor logico de si el usuario puede o no agregarse al grafo 
     */
    public boolean validarAddUser (Grafo grafo,String idUser1, String username1){
        try{
            if (username1.charAt(0)!='@'){
                    JOptionPane.showMessageDialog(null, "Error: Recuerde colocar @ antes de los usernames de los usuarios");
                    return false;
            }
            int id1 = Integer.parseInt(idUser1);

            ListaVertex listaUsers = grafo.getUserList();
            for (NodoVertex pointer = listaUsers.getHead(); pointer != listaUsers.getTail(); pointer = pointer.getNext()) {
                User usuarioComparar =(User) pointer.getElement();
                User ultimoUser = (User) listaUsers.getTail().getElement();
                String usernameComparar = usuarioComparar.getUsername();
                String ultimoUsername = ultimoUser.getUsername();
                int idComparar = usuarioComparar.getUserID();
                int ultimoId = ultimoUser.getUserID();
                if( idComparar == id1 || idComparar == ultimoId){
                    JOptionPane.showMessageDialog(null, "Ya existe un usuario registrado con el id "+id1+"\nIngrese unicamente usuarios nuevos por favor.");
                    return false;
                } else if( usernameComparar.trim().equalsIgnoreCase(username1) ||  ultimoUsername.trim().equalsIgnoreCase(username1)){
                    JOptionPane.showMessageDialog(null, "Ya existe un usuario registrado con el username "+username1+"\nIngrese unicamente usuarios nuevos por favor.");
                    return false;
                }

        }}catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: Recuerde solo ingresar numeros enteros como id");
            return false;
        } 
        return true;
        
        }
         
    /**
     * Metodo que permite convertir el grafo guardado al grafo requerido por la libreria para poder dibujarlo
     * @param grafo actual
     * @return Grafo de la clase Graph perteneciente a la libreria GraphStream 
     */
    public Graph drawGraph (Grafo grafo){
        Graph graph = new MultiGraph("Relacion");
        System.setProperty("org.graphstream.ui", "swing");
        graph.setAttribute("ui.stylesheet", "node{\n"+ "size:40px,30px;\n"+"fill-color:#9EBCEF; \n"+"text-mode: normal; \n"+"}");
        
        for (int i=0;i<grafo.getUserList().getSize();i++){
            String user= grafo.getUserList().getDato(i).getElement().getUsername();
            String userid = grafo.getUserList().getDato(i).getElement().getUsername();
            graph.addNode(user).setAttribute("ui.label",userid);
        }
        // Se recorre la lista de adyacencia de nuestro grafo para añadir los arcos y pesos al grafo de GraphStream
        for (int i=0; i < grafo.getUserList().getSize(); i++){
            String friend1 = grafo.getUserList().getDato(i).getElement().getUsername();
            NodoVertex node1 = grafo.getUserList().getDato(i);
            for (int j=0; j<node1.getFriendList().getSize(); j++){
                String friend2 = node1.getFriendList().getDato(j).getFriend().getUsername();
                String weight = String.valueOf(node1.getFriendList().getDato(j).getWeight());
                String weightName = friend1 + friend2;
                graph.addEdge(weightName, friend1, friend2, false).setAttribute("ui.label", weight);
            }
    } return graph;
    }
    
    /**
     * Metodo que permite visualizar el grafo, haciendo uso de la libreria GraphStream 
     * @param graph, grafo del la clase Graph obtenido en el metodo drawGraph
     */
    public void viewGraph(Graph graph) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout()){
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(640, 480);
            }
        };
        frame.setSize(panel.getWidth(), panel.getHeight());
        frame.setBackground(Color.blue);
        Viewer viewer = new SwingViewer(graph, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        viewer.enableAutoLayout();
        ViewPanel viewPanel = (ViewPanel) viewer.addDefaultView(false);
        panel.add(viewPanel);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  
        
    }
    
    /**
     * Metodo que permite visualizar un grafo auxiliar creado para prevenir errores que puedan surgir de la libreria GraphStream
     */
    public void drawGrafoAux (){
        Grafo grafoAuxiliar = new Grafo();
        infoGrafo = f.leertxt("test\\TxtProyecto.txt");
        users = use.getUsuarios(infoGrafo);
        relaciones = use.getRelaciones(infoGrafo);
        grafoAuxiliar = crearGrafo(users, relaciones);
        Graph dibujo = drawGraph(grafoAuxiliar);
        viewGraph(dibujo);
        
        
    } 
    
}
